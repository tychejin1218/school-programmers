package level0;

/**
 * 캐릭터의 좌표
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */
public class Problem120861 {

  public int[] solution(String[] keyinput, int[] board) {

    String keyValue = "";
    int positionX = 0;
    int positionY = 0;
    int maxPositionX = board[0] / 2;
    int minPositionX = maxPositionX * -1;
    int maxPositionY = board[1] / 2;
    int minPositionY = maxPositionY * -1;

    for (int a = 0; a < keyinput.length; a++) {

      keyValue = keyinput[a];

      if (positionX < maxPositionX && positionX > minPositionX) {
        if ("right".equals(keyValue)) {
          positionX = positionX + 1;
        } else if ("left".equals(keyValue)) {
          positionX = positionX - 1;
        }
      }

      if (positionY < maxPositionY && positionY > minPositionY) {
        if ("up".equals(keyValue)) {
          positionY = positionY + 1;
        } else if ("down".equals(keyValue)) {
          positionY = positionY - 1;
        }
      }
    }

    int[] answer = {positionX, positionY};

    return answer;
  }
}
