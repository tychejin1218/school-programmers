package level0.problem120000;

/**
 * 각도기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */
public class Problem120829 {

  public int solution(int angle) {
    int answer = 0;

    if (angle > 0 && angle < 90) {
      answer = 1;
    } else if (angle == 90) {
      answer = 2;
    } else if (angle > 90 && angle < 180) {
      answer = 3;
    } else if (angle == 180) {
      answer = 4;
    }

    return answer;
  }
}
