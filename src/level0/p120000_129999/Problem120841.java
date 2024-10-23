package level0.p120000_129999;

/**
 * 점의 위치 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120841
 */
public class Problem120841 {

  public int solution(int[] dot) {
    int answer = 0;

    int x = dot[0];
    int y = dot[1];

    if (x > 0) {
      if (y > 0) {
        answer = 1;
      } else {
        answer = 4;
      }
    } else {
      if (y > 0) {
        answer = 2;
      } else {
        answer = 3;
      }
    }

    return answer;
  }
}
