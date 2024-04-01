package level0.problem180000;

import java.util.stream.IntStream;

/**
 * 조건에 맞게 수열 변환하기 3
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181835
 */
public class Problem181835 {

  public int[] solution(int[] arr, int k) {
    String operator = k % 2 != 0 ? "*" : "+";
    return IntStream.range(0, arr.length)
        .map(m -> "*".equals(operator) ? arr[m] * k : arr[m] + k)
        .toArray();
  }
}
