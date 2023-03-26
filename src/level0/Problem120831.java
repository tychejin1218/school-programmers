package level0;

import java.util.stream.IntStream;

/**
 * 짝수의 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class Problem120831 {

  public int solution(int n) {
    return IntStream.rangeClosed(0, n)
        .filter(p -> p % 2 == 0)
        .sum();
  }
}
