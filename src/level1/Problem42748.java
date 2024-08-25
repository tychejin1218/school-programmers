package level1;

import java.util.Arrays;

/**
 * K번째수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */
public class Problem42748 {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    int idx = 0;
    for (int[] command : commands) {
      int i = command[0] - 1;
      int j = command[1];
      int k = command[2] - 1;

      answer[idx++] = Arrays.stream(array, i, j)
          .sorted()
          .toArray()[k];
    }

    return answer;
  }
}
