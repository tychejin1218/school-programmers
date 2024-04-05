package level0.problem180000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 뒤에서 5등 위로
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181852
 */
public class Problem181852 {

  public int[] solution01(int[] num_list) {
    Arrays.sort(num_list);
    return IntStream.range(5, num_list.length)
        .map(n -> num_list[n])
        .boxed()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public int[] solution02(int[] num_list) {
    Arrays.sort(num_list);
    return Arrays.stream(num_list)
        .skip(5)
        .toArray();
  }

  public int[] solution(int[] num_list) {
    return Arrays.stream(num_list)
        .sorted()
        .skip(5)
        .toArray();
  }
}
