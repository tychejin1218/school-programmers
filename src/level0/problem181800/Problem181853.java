package level0.problem181800;

import java.util.Arrays;

/**
 * 뒤에서 5등까지
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181853
 */
public class Problem181853 {

  public int[] solution(int[] num_list) {
    return Arrays.stream(num_list)
        .sorted()
        .limit(5)
        .toArray();
  }
}
