package level0.problem120000;

/**
 * 세균 증식
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */
public class Problem120910 {

  public int solution01(int n, int t) {
    int answer = n;

    for (int a = 0; a < t; a++) {
      answer = answer * 2;
    }

    return answer;
  }

  public int solution(int n, int t) {
    return n * (int) Math.pow(2, t);
  }
}
