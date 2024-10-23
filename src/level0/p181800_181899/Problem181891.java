package level0.p181800_181899;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 순서 바꾸기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181891
 */
public class Problem181891 {

  public int[] solution(int[] num_list, int n) {
    return IntStream.concat(
        Arrays.stream(Arrays.copyOfRange(num_list, n, num_list.length)),
        Arrays.stream(Arrays.copyOfRange(num_list, 0, n))
    ).toArray();
  }
}
