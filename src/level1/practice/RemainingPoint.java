package level1.practice;

/**
 * 나머지 한 점의 좌표
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/13702
 * <p/>
 * [문제 설명]
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구합니다.
 * 직사각형의 각 변은 x축, y축에 평행합니다.
 * <p/>
 * [핵심 아이디어]
 * - 직사각형의 4꼭짓점에서 x좌표는 2가지 값이 각각 2번씩 등장합니다.
 * - y좌표도 마찬가지로 2가지 값이 각각 2번씩 등장합니다.
 * - 따라서 3개의 점에서 딱 1번만 등장하는 x값, y값이 빠진 점의 좌표입니다.
 * <p/>
 * [예시]
 * v = [[1,4],[3,4],[3,10]]
 * x좌표: 1, 3, 3 → 1은 1번, 3은 2번 등장 → 빠진 x = 1
 * y좌표: 4, 4, 10 → 4는 2번, 10은 1번 등장 → 빠진 y = 10
 * 정답: [1, 10]
 * <p/>
 * [시간복잡도] O(1) - 입력 크기가 항상 3개로 고정
 * [공간복잡도] O(1) - 추가 자료구조 없이 변수만 사용
 * <p/>
 * [면접 포인트]
 * Q. 왜 if-else로 비교했나요?
 * A. 입력이 항상 3개로 고정이므로 단순 비교가 가장 직관적이고 빠릅니다.
 *    대안으로 HashMap이나 XOR 연산을 사용할 수 있으나, 이 문제에서는 과도한 복잡성입니다.
 */
public class RemainingPoint {

  public int[] solution(int[][] v) {

    int[] answer = new int[2];

    // x좌표 3개를 꺼냄
    int x0 = v[0][0];
    int x1 = v[1][0];
    int x2 = v[2][0];

    // y좌표 3개를 꺼냄
    int y0 = v[0][1];
    int y1 = v[1][1];
    int y2 = v[2][1];

    // x좌표 중 혼자 다른 값(1번만 등장하는 값)을 찾음
    int missingX;
    if (x0 == x1) {
      // x0과 x1이 같으면 x2가 혼자 다른 값
      missingX = x2;
    } else if (x0 == x2) {
      // x0과 x2가 같으면 x1이 혼자 다른 값
      missingX = x1;
    } else {
      // x1과 x2가 같으면 x0이 혼자 다른 값
      missingX = x0;
    }

    // y좌표 중 혼자 다른 값(1번만 등장하는 값)을 찾음
    int missingY;
    if (y0 == y1) {
      // y0과 y1이 같으면 y2가 혼자 다른 값
      missingY = y2;
    } else if (y0 == y2) {
      // y0과 y2가 같으면 y1이 혼자 다른 값
      missingY = y1;
    } else {
      // y1과 y2가 같으면 y0이 혼자 다른 값
      missingY = y0;
    }

    answer[0] = missingX;
    answer[1] = missingY;

    return answer;
  }
}
