package level0;

import java.util.Arrays;

/**
 * 삼각형의 완성조건 (2)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120868
 */
public class Problem120868 {

  public int solution(int[] sides) {
    int answer = 0;

    Arrays.sort(sides);
    int minSide = sides[0];
    int maxSide = sides[1];

    for (int a = maxSide - minSide + 1; a <= maxSide; a++) {
      answer++;
    }

    System.out.println("===");
    for (int a = maxSide + 1; a < maxSide + minSide; a++) {
      answer++;
    }

    return answer;
  }
}
