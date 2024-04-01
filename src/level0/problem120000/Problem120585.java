package level0.problem120000;

import java.util.Arrays;

/**
 * 머쓱이보다 키 큰 사람
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */
public class Problem120585 {

  public int solution(int[] array, int height) {
    return (int) Arrays.stream(array)
        .filter(h -> h > height)
        .count();
  }
}
