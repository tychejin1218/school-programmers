package level0.problem181800;

import java.util.stream.IntStream;

/**
 * n개 간격의 원소들
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */
public class Problem181888 {

  public int[] solution(int[] num_list, int n) {
    return IntStream.range(0, num_list.length)
        .filter(i -> i % n ==0)
        .map(i -> num_list[i])
        .toArray();
  }
}
