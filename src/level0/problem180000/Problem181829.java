package level0.problem180000;

import java.util.stream.IntStream;

/**
 * 이차원 배열 대각선 순회하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181829
 */
public class Problem181829 {

  public int solution01(int[][] board, int k) {
    int answer = 0;
    for (int a = 0; a < board.length; a++) {
      for (int b = 0; b < board[a].length; b++) {
        if (a + b <= k) {
          answer += board[a][b];
        }
      }
    }
    return answer;
  }

  public static int solution(int[][] board, int k) {
    return IntStream.range(0, board.length)
        .filter(i -> i <= k)
        .map(i ->
            IntStream.range(0, board[i].length)
                .filter(j -> j <= k - i)
                .map(j -> board[i][j])
                .sum())
        .sum();
  }
}
