package level1.p60000_69999;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 크레인 인형뽑기 게임
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */
public class Problem64061 {

  public int solution(int[][] board, int[] moves) {
    int answer = 0;

    Map<Integer, Integer> boardMap = new HashMap<>();
    for (int i = 0; i < board[0].length; i++) {
      boardMap.put(i, 0);
    }

    List<Integer> boardList = new ArrayList<>();

    for (int move : moves) {
      int boardRow = boardMap.get(move - 1);
      int boardCol = move - 1;

      while (boardRow < board.length) {
        int boardNum = board[boardRow][boardCol];
        if (boardNum != 0) {
          boardList.add(boardNum);
          boardMap.put(boardCol, boardRow + 1);
          break;
        }
        boardRow++;
        boardMap.put(boardCol, boardRow);
      }

      if (boardList.size() > 1) {
        int lastIndex = boardList.size() - 1;
        if (Objects.equals(boardList.get(lastIndex), boardList.get(lastIndex - 1))) {
          boardList.remove(lastIndex);
          boardList.remove(lastIndex - 1);
          answer += 2;
        }
      }
    }

    return answer;
  }
}
