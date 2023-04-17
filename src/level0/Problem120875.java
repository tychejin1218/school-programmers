package level0;

/**
 * 평행
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120875
 */
public class Problem120875 {

  public int solution(int[][] dots) {

    int answer = 0;

    int x1 = dots[0][0];
    int y1 = dots[0][1];
    int x2 = dots[1][0];
    int y2 = dots[1][1];
    int x3 = dots[2][0];
    int y3 = dots[2][1];
    int x4 = dots[3][0];
    int y4 = dots[3][1];

    int distanceX21 = Math.abs(x2 - x1);
    int distanceX43 = Math.abs(x4 - x3);
    int distanceY21 = Math.abs(y2 - y1);
    int distanceY43 = Math.abs(y4 - y3);

    int distanceX31 = Math.abs(x3 - x1);
    int distanceX42 = Math.abs(x4 - x2);
    int distanceY31 = Math.abs(y3 - y1);
    int distanceY42 = Math.abs(y4 - y2);

    int distanceX41 = Math.abs(x4 - x1);
    int distanceX32 = Math.abs(x3 - x2);
    int distanceY41 = Math.abs(y4 - y1);
    int distancey32 = Math.abs(y3 - y2);

    if (distanceX21 == distanceX21 && distanceY21 == distanceY43) {
      answer = 1;
    } else if (distanceX31 == distanceX42 && distanceY31 == distanceY42) {
      answer = 1;
    } else if (distanceX41 == distanceX32 && distanceY41 == distancey32) {
      answer = 1;
    }

    return answer;
  }
}
