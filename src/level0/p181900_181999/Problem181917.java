package level0.p181900_181999;

import java.util.stream.Stream;

/**
 * 간단한 논리 연산
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181917
 */
public class Problem181917 {

  public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
    long count = Stream.of(x1, x2, x3, x4)
        .mapToInt(i -> i ? 1 : 0)
        .sum();
    return count % 2 == 0;
  }
}
