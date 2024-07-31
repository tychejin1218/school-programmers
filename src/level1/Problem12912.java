package level1;

import java.util.stream.IntStream;

/**
 * 두 정수 사이의 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
public class Problem12912 {

  public long solution(int a, int b) {
    return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
        .asLongStream()
        .sum();
  }
}
