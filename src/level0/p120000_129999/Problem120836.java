package level0.p120000_129999;

import java.util.stream.IntStream;

/**
 * 순서쌍의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */
public class Problem120836 {

  /*public int solution(int n) {

    int answer = 0;

    for (int a = 1; a <= n; a++) {
      if (n % a == 0) {
        answer += 1;
      }
    }

    return answer;
  }*/

  public int solution(int n) {
    return (int) IntStream.rangeClosed(1, n)
        .filter(p -> n % p == 0)
        .count();
  }
}
