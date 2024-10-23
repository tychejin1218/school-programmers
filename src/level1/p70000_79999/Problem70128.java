package level1.p70000_79999;

import java.util.stream.IntStream;

/**
 * 내적
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */
public class Problem70128 {

  public int solution(int[] a, int[] b) {
    return IntStream.range(0, a.length)
        .map(i -> a[i] * b[i])
        .sum();
  }
}
