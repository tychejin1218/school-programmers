package level0.problem181900;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 마지막 두 원소
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */
public class Problem181927 {

  public int[] solution01(int[] num_list) {
    int numLen = num_list.length;
    int[] answer = Arrays.copyOf(num_list, numLen + 1);
    answer[numLen] = num_list[numLen - 1] - num_list[numLen - 2] > 0
        ? num_list[numLen - 1] - num_list[numLen - 2] : num_list[numLen - 1] * 2;
    return answer;
  }

  public int[] solution(int[] num_list) {
    return IntStream.rangeClosed(0, num_list.length)
        .map(i -> {
          if (i == num_list.length) {
            return num_list[i - 1] - num_list[i - 2] > 0
                ? num_list[i - 1] - num_list[i - 2] : num_list[i - 1] * 2;
          } else {
            return num_list[i];
          }
        }).toArray();
  }
}
