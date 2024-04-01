package level0.problem120000;

/**
 * 직사각형 넓이 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120860
 */
public class Problem120860 {

  public int solution(int[][] dots) {

    int minX = dots[0][0];
    int maxX = dots[1][0];
    int minY = dots[0][1];
    int maxY = dots[1][1];

    for (int a = 0; a < dots.length; a++) {
      if (minX < dots[a][0]) {
        minX = dots[a][0];
      }
      if (maxX > dots[a][0]) {
        maxX = dots[a][0];
      }
      if (minY < dots[a][1]) {
        minY = dots[a][1];
      }
      if (maxY > dots[a][1]) {
        maxY = dots[a][1];
      }
    }

    return Math.abs(maxX - minX) * Math.abs(maxY - minY);
  }
}
