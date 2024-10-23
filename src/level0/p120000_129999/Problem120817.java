package level0.p120000_129999;

import java.util.Arrays;

/**
 * 배열의 평균값
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */
public class Problem120817 {

  public double solution(int[] numbers) {
    return Arrays.stream(numbers)
        .average()
        .getAsDouble();
  }
}
