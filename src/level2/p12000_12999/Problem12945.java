package level2.p12000_12999;

/**
 * 피보나치 수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */
public class Problem12945 {

  public int solution(int n) {
    return getFibonacci(n);
  }

  public int getFibonacci(int n) {
    if (n <= 1) {
      return n;
    }

    int prev1 = 0;
    int prev2 = 1;
    int result = 0;

    for (int i = 2; i <= n; i++) {
      result = (prev1 + prev2) % 1234567;
      prev1 = prev2;
      prev2 = result;
    }

    return result;
  }
}
