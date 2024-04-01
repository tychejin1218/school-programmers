package level0.problem120000;

import java.util.Arrays;

/**
 * 안전지대
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120866
 */
public class Problem120866 {

  public int solution(int[][] board) {

    int row = board.length;
    int col = board[0].length;

    int[][] result = new int[row][col];

    for (int a = 0; a < row; a++) {
      for (int b = 0; b < board[a].length; b++) {
        if (board[a][b] == 1) {

          result[a][b] = 1;

          if (0 < a) {
            result[a - 1][b] = 1;

            if (0 < b) {
              result[a - 1][b - 1] = 1;
            }

            if (b < board[a].length - 1) {
              result[a - 1][b + 1] = 1;
            }
          }

          if (a < board.length - 1) {
            result[a + 1][b] = 1;

            if (0 < b) {
              result[a + 1][b - 1] = 1;
            }

            if (b < board[a].length - 1) {
              result[a + 1][b + 1] = 1;
            }
          }

          if (0 < b) {
            result[a][b - 1] = 1;
          }

          if (b < board[a].length - 1) {
            result[a][b + 1] = 1;
          }
        }
      }
    }

    return (int) Arrays.stream(result)
        .flatMapToInt(Arrays::stream)
        .filter(p -> p == 0)
        .count();
  }
}
