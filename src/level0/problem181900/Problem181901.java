package level0.problem181900;

import java.util.stream.IntStream;

/**
 * 배열 만들기 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181901
 */
public class Problem181901 {

  public int[] solution(int n, int k) {
    return IntStream.rangeClosed(1, n)
        .filter(i -> i % k == 0)
        .toArray();
  }
}
