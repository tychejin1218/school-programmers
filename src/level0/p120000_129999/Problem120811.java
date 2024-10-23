package level0.p120000_129999;

import java.util.Arrays;

/**
 * 중앙값 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */
public class Problem120811 {

  public int solution(int[] array) {
    Arrays.sort(array);
    return array[array.length / 2];
  }
}
