package level0.problem180000;

import java.util.Arrays;

/**
 * 문자열 정수의 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181849
 */
public class Problem181849 {

  public int solution01(String num_str) {
    return Arrays.stream(num_str.split(""))
        .mapToInt(num -> Integer.parseInt(num))
        .sum();
  }

  public int solution(String num_str) {
    return Arrays.stream(num_str.split(""))
        .mapToInt(Integer::parseInt)
        .sum();
  }
}
