package level0.problem181800;

import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181882
 */
public class Problem181882 {

  public int[] solution(int[] arr) {
    return Arrays.stream(arr)
        .map(i -> {
          int result = i;
          if (i >= 50 && i % 2 == 0) {
            result = i / 2;
          } else if (i < 50 && i % 2 != 0) {
            result = i * 2;
          }
          return result;
        })
        .toArray();
  }
}
