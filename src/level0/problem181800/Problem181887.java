package level0.problem181800;

import java.util.stream.IntStream;

/**
 * 홀수 vs 짝수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */
public class Problem181887 {

  public int solution(int[] num_list) {

    int even = IntStream.range(0, num_list.length)
        .filter(i -> i % 2 == 0)
        .map(i -> num_list[i])
        .sum();

    int odd = IntStream.range(0, num_list.length)
        .filter(i -> i % 2 != 0)
        .map(i -> num_list[i])
        .sum();

    return Math.max(even, odd);
  }
}
