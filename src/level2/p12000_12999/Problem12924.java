package level2.p12000_12999;

/**
 * 숫자의 표현
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class Problem12924 {

  public int solution(int n) {
    int answer = 0;

    for (int i = 1; i <= n; i++) {
      int sum = 0;
      for (int j = i; j <= n; j++) {
        sum += j;
        if (sum == n) {
          answer++;
          break;
        } else if (sum > n) {
          break;
        }
      }
    }

    return answer;
  }
}
