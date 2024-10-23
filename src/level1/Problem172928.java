package level1;

/**
 * 공원 산책
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/172928
 */
public class Problem172928 {

  public int[] solution(String[] park, String[] routes) {

    int moveX = 0;
    int moveY = 0;

    for (int i = 0; i < park.length; i++) {
      char[] parkCharArr = park[i].toCharArray();
      for (int j = 0; j < parkCharArr.length; j++) {
        if (parkCharArr[j] == 'S') {
          moveX = j;
          moveY = i;
          break;
        }
      }
    }

    for (String route : routes) {
      String[] parts = route.split(" ");
      char direction = parts[0].charAt(0);
      int distance = Integer.parseInt(parts[1]);

      int newY = moveY;
      int newX = moveX;

      boolean isMove = true;
      for (int i = 0; i < distance; i++) {
        switch (direction) {
          case 'N':
            newY--;
            break;
          case 'S':
            newY++;
            break;
          case 'W':
            newX--;
            break;
          case 'E':
            newX++;
            break;
        }
        if (newX < 0
            || newX >= park[0].length()
            || newY < 0
            || newY >= park.length
            || park[newY].charAt(newX) == 'X') {
          isMove = false;
          break;
        }
      }
      if (isMove) {
        moveY = newY;
        moveX = newX;
      }
    }

    return new int[]{moveY, moveX};
  }
}
