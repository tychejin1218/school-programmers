package level0.p120000_129999;

/**
 * 팩토리얼
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120848
 */
public class Problem120848 {

  public int solution(int n) {
    int answer = 0;

    int factorial = 1;
    for (int a = 1; a < 11; a++) {

      factorial = factorial * a;
      if (factorial > n) {
        answer = a - 1;
        break;
      } else if (factorial == n) {
        answer = a;
        break;
      }
    }

    return answer;
  }
}
