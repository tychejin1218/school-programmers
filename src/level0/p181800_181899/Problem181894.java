package level0.p181800_181899;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 2의 영역
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */
public class Problem181894 {

  public int[] solution(int[] arr) {

    int[] indexs = IntStream.range(0, arr.length)
        .filter(i -> arr[i] == 2)
        .toArray();
    if (indexs.length == 1) {
      return new int[]{2};
    } else if (indexs.length > 1) {
      return Arrays.copyOfRange(arr, indexs[0], indexs[indexs.length - 1] + 1);
    }

    return new int[]{-1};
  }
}
