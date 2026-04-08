package level1.practice;

/**
 * 과속 단속
 * <p/>
 * [문제 설명]
 * 자동차가 카메라 설치 지점을 지난 순간의 시각을 기록합니다.
 * 바로 이전 지점을 지난 시각을 이용해 평균속도를 계산합니다.
 * 평균속도가 제한속도(speed_limit)보다 크면 과속으로 기록합니다.
 * 0km 지점에는 항상 카메라가 있으며, 출발 시각은 0입니다.
 * cameras 배열에는 0km 지점이 포함되지 않습니다.
 * <p/>
 * [제한 사항]
 * - speed_limit: 30 이상 200 이하 자연수
 * - cameras 길이: 1 이상 20 이하
 * - cameras[i][0] (카메라 위치): 1 이상 20000 이하 자연수
 * - cameras[i][1] (통과 시각): 1 이상 100 이하 자연수
 * - 카메라 위치와 통과 시각 모두 증가하는 순서로 주어짐
 * <p/>
 * [핵심 아이디어]
 * - 평균속도 = 거리 / 시간
 * - 과속 조건: 평균속도 > speed_limit
 * - 부동소수점 오류 방지: distance > speed_limit * time 으로 비교
 * - 0km/시각0 시작점은 cameras 배열에 없으므로 별도로 초기값 설정
 * <p/>
 * [예시] speed_limit=60, cameras=[[60,1],[130,2],[240,4],[432,7]]
 * 구간 0→60:   distance=60, time=1, 평균속도=60.0  → 과속 X
 * 구간 60→130: distance=70, time=1, 평균속도=70.0  → 과속 O (count=1)
 * 구간 130→240: distance=110, time=2, 평균속도=55.0 → 과속 X
 * 구간 240→432: distance=192, time=3, 평균속도=64.0 → 과속 O (count=2)
 * 정답: 2
 * <p/>
 * [시간복잡도] O(n) - cameras 배열을 한 번 순회
 * [공간복잡도] O(1) - 추가 자료구조 없이 변수만 사용
 * <p/>
 * [면접 포인트]
 * Q. 왜 distance / time > speed_limit 대신 distance > speed_limit * time 을 사용했나요?
 * A. 정수 나눗셈 시 소수점이 잘려 오차가 발생할 수 있습니다.
 *    예) distance=70, time=1, speed_limit=60 → 70/1=70 (정상)
 *        distance=91, time=3, speed_limit=30 → 91/3=30 (int 나눗셈) → 과속 미감지
 *    양변에 time을 곱하면 정수 연산만으로 정확하게 비교할 수 있습니다.
 * Q. 왜 0km/시각0을 cameras 배열 밖에서 처리했나요?
 * A. 제한 사항에서 cameras[i][0]은 1 이상이므로, 0km 지점은 cameras 배열에 포함되지 않습니다.
 *    prevPosition=0, prevTime=0으로 초기화하여 첫 구간도 정확히 계산합니다.
 */
public class SpeedCamera {

  public long solution(int speed_limit, int[][] cameras) {

    long count = 0;

    // 문제 조건: 0km 지점에서 시각 0에 출발 (cameras 배열에 포함되지 않음)
    int prevPosition = 0;
    int prevTime = 0;

    for (int i = 0; i < cameras.length; i++) {

      int currentPosition = cameras[i][0];
      int currentTime = cameras[i][1];

      // 이전 지점과 현재 지점 사이의 거리
      int distance = currentPosition - prevPosition;

      // 이전 시각과 현재 시각 사이의 시간
      int time = currentTime - prevTime;

      // 과속 조건: 평균속도(distance/time) > speed_limit
      // 부동소수점 오류 방지를 위해 양변에 time을 곱해서 비교
      boolean isSpeeding = distance > speed_limit * time;

      if (isSpeeding) {
        count++;
      }

      System.out.println("구간: " + prevPosition + "km(시각" + prevTime + ")"
          + " → " + currentPosition + "km(시각" + currentTime + ")"
          + " | 거리: " + distance + "km"
          + " | 시간: " + time
          + " | 평균속도: " + (double) distance / time
          + " | 제한속도: " + speed_limit
          + " | 과속: " + isSpeeding);

      // 현재 카메라 정보를 다음 반복의 이전값으로 업데이트
      prevPosition = currentPosition;
      prevTime = currentTime;
    }

    System.out.println("\n총 과속 횟수: " + count);

    return count;
  }

  public static void main(String[] args) {
    SpeedCamera sol = new SpeedCamera();

    int[][] cameras = {{60, 1}, {130, 2}, {240, 4}, {432, 7}};
    int speed_limit = 60;

    sol.solution(speed_limit, cameras);
  }
}
