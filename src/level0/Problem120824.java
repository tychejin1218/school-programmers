package level0;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 짝수 홀수 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
public class Problem120824 {

  /*public int[] solution(int[] num_list) {

    int even = (int) Arrays.stream(num_list)
        .filter(p -> p % 2 == 0)
        .count();

    int odd = (int) Arrays.stream(num_list)
        .filter(p -> p % 2 != 0)
        .count();

    return new int[]{even, odd};
  }*/

  public int[] solution(int[] num_list) {

    int even = (int) Arrays.stream(num_list)
        .filter(p -> p % 2 == 0)
        .count();

    int odd = (int) Arrays.stream(num_list)
        .filter(p -> p % 2 != 0)
        .count();

    return IntStream.of(even, odd).toArray();
  }
}
