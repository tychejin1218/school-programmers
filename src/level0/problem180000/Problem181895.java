package level0.problem180000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열 만들기 3
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */
public class Problem181895 {

  public int[] solution(int[] arr, int[][] intervals) {
    return IntStream.concat(
        Arrays.stream(Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1)),
        Arrays.stream(Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1))
    ).toArray();
  }
}
