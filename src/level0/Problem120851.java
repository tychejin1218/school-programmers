package level0;

import java.util.Arrays;

/**
 * 숨어있는 숫자의 덧셈 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class Problem120851 {

  public int solution(String my_string) {
    return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split(""))
        .mapToInt(Integer::parseInt)
        .sum();
  }
}
