package level0.p181800_181899;

import java.util.stream.IntStream;

/**
 * n 번째 원소까지
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */
public class Problem181889 {

  public int[] solution(int[] num_list, int n) {
    return IntStream.range(0, n)
        .map(i -> num_list[i])
        .toArray();
  }
}
