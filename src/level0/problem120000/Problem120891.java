package level0.problem120000;

import java.util.Arrays;

/**
 * 369게임
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120891
 */
public class Problem120891 {

  public int solution(int order) {
    return (int) Arrays.stream(String.valueOf(order).split(""))
        .mapToInt(Integer::parseInt)
        .filter(p -> p != 0 && p % 3 == 0)
        .count();
  }
}
