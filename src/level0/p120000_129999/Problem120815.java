package level0.p120000_129999;

import java.util.stream.IntStream;

/**
 * 피자 나눠 먹기 (2)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815
 */
public class Problem120815 {

  /*public int solution(int n) {
    int answer = 0;
    for (int a = 1; a <= 100; a++) {
      if ((a * 6) % n == 0) {
        answer = a;
        break;
      }
    }
    return answer;
  }*/

  public int solution(int n) {
    return IntStream.rangeClosed(1, 100)
        .filter(p -> (p * 6) % n == 0)
        .findFirst()
        .getAsInt();
  }
}
