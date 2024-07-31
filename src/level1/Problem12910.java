package level1;

import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class Problem12910 {

  public int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr)
        .filter(i -> i % divisor == 0)
        .sorted()
        .toArray();
    return answer.length > 0 ? answer : new int[]{-1};
  }
}
