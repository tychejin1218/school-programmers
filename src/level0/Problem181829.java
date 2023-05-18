package level0;

/**
 * 이차원 배열 대각선 순회하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181829
 */
public class Problem181829 {

  public int solution(int[][] board, int k) {
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
}
