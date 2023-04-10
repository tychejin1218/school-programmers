package level0;

/**
 * 캐릭터의 좌표
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */
public class Problem120861 {

  public int[] solution1(String[] keyinput, int[] board) {

    int positionX = 0;
    int positionY = 0;

    if (keyinput.length >= 0) {

      String keyValue = "";
      int maxPositionX = board[0] / 2 != 0 ? board[0] / 2 : 1;
      int minPositionX = maxPositionX * -1;
      int maxPositionY = board[1] / 2 != 0 ? board[1] / 2 : 1;
      int minPositionY = maxPositionY * -1;

      for (int a = 0; a < keyinput.length; a++) {

        keyValue = keyinput[a];

        if (positionX < maxPositionX && positionX > minPositionX) {
          if ("right".equals(keyValue)) {
            positionX++;
          } else if ("left".equals(keyValue)) {
            positionX--;
          }
        } else if (positionY < maxPositionY && positionY > minPositionY) {
          if ("up".equals(keyValue)) {
            positionY++;
          } else if ("down".equals(keyValue)) {
            positionY--;
          }
        }
      }
    }

    return new int[]{positionX, positionY};
  }


  public int[] solution(String[] keyinput, int[] board) {

    String keyValue = "";
    int positionX = 0;
    int positionY = 0;

    for (int a = 0; a < keyinput.length; a++) {

      keyValue = keyinput[a];

      if (keyValue.equals("right")) {
        positionX++;
        if (positionX > board[0] / 2) {
          positionX = board[0] / 2;
        }
      } else if (keyValue.equals("left")) {
        positionX--;
        if (positionX < -(int) (board[0] / 2)) {
          positionX = -(int) (board[0] / 2);
        }
      } else if (keyValue.equals("up")) {
        positionY++;
        if (positionY > board[1] / 2) {
          positionY = board[1] / 2;
        }
      } else if (keyValue.equals("down")) {
        positionY--;
        if (positionY < -(int) (board[1] / 2)) {
          positionY = -(int) (board[1] / 2);
        }
      }
    }

    return new int[]{positionX, positionY};
  }
}
