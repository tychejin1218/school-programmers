package level0.p120000_129999;

import java.util.Arrays;

/**
 * 삼각형의 완성조건 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */
public class Problem120889 {

  public int solution(int[] sides) {
    Arrays.sort(sides);
    return sides[2] < sides[1] + sides[0] ? 1 : 2;
  }
}
