package level0.problem181800;

import java.util.stream.IntStream;

/**
 * n 번째 원소부터
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181892
 */
public class Problem181892 {

  public int[] solution(int[] num_list, int n) {
    return IntStream.range(n - 1, num_list.length)
        .map(i -> num_list[i])
        .toArray();
  }
}
