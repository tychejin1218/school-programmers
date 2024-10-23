package level0.p120000_129999;

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

    int distanceX21 = x2 - x1;
    int distanceX43 = x4 - x3;
    int distanceY21 = y2 - y1;
    int distanceY43 = y4 - y3;
    int distanceX31 = x3 - x1;
    int distanceX42 = x4 - x2;
    int distanceY31 = y3 - y1;
    int distanceY42 = y4 - y2;
    int distanceX41 = x4 - x1;
    int distanceX32 = x3 - x2;
    int distanceY41 = y4 - y1;
    int distancey32 = y3 - y2;

    if ((double) distanceY21 / distanceX21 == (double) distanceY43 / distanceX43) {
      answer = 1;
    } else if ((double) distanceY31 / distanceX31 == (double) distanceY42 / distanceX42) {
      answer = 1;
    } else if ((double) distanceY41 / distanceX41 == (double) distancey32 / distancey32) {
      answer = 1;
    }

    return answer;
  }
}
