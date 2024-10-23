package level0.p120000_129999;

import java.util.stream.IntStream;

/**
 * 2차원으로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120842
 */
public class Problem120842 {

  /*public int[][] solution(int[] num_list, int n) {

    int numLen01 = 0;
    int numLen02 = 0;
    int[][] answer = new int[num_list.length / n][n];

    for (int a = 0; a < num_list.length; a++) {

      answer[numLen01][numLen02] = num_list[a];

      if (numLen02 < n - 1) {
        numLen02++;
      } else {
        numLen01++;
        numLen02 = 0;
      }
    }

    return answer;
  }*/

  public int[][] solution(int[] num_list, int n) {
    return IntStream.range(0, num_list.length / n)
        .mapToObj(a ->
            IntStream.range(0, n)
                .map(b -> num_list[a * n + b])
                .toArray())
        .toArray(int[][]::new);
  }
}
