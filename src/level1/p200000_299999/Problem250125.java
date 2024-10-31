package level1.p200000_299999;

/**
 * [PCCE 기출문제] 9번 / 이웃한 칸
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/250125
 */
public class Problem250125 {

  public int solution(String[][] board, int h, int w) {

    int n = board.length;
    int count = 0;
    int[] dh = {0, 1, -1, 0};
    int[] dw = {1, 0, 0, -1};

    for (int i = 0; i <= 3; i++) {
      int h_check = h + dh[i];
      int w_check = w + dw[i];
      if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
        if (board[h][w].equals(board[h_check][w_check])) {
          count++;
        }
      }
    }

    return count;
  }
}
