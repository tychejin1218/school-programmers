package level0.problem120000;

import java.util.Arrays;

/**
 * 자릿수 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */
public class Problem120906 {

  public int solution(int n) {
    return Arrays.stream(String.valueOf(n).split(""))
        .mapToInt(Integer::parseInt)
        .sum();
  }
}
