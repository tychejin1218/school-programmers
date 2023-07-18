package level0;

import java.util.stream.IntStream;

/**
 * 특별한 이차원 배열 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181833
 */
public class Problem181833 {

  public int[][] solution01(int n) {

    int[][] answer = new int[n][n];

    for (int a = 0; a < n; a++) {
      for (int b = 0; b < n; b++) {
        if (a == b) {
          answer[a][b] = 1;
        } else {
          answer[a][b] = 0;
        }
      }
    }

    return answer;
  }

  public int[][] solution(int n) {
    return IntStream.range(0, n)
        .mapToObj(i ->
            IntStream.range(0, n)
                .map(j -> i == j ? 1 : 0)
                .toArray()
        )
        .toArray(int[][]::new);
  }
}
