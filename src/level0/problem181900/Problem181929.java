package level0.problem181900;

import java.util.Arrays;

/**
 * 원소들의 곱과 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */
public class Problem181929 {

  public int solution(int[] num_list) {
    return Arrays.stream(num_list).reduce(1, (a, b) -> a * b) >
        Math.pow(Arrays.stream(num_list).sum(), 2) ? 0 : 1;
  }
}
