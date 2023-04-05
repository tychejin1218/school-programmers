package level0;

import java.util.Arrays;

/**
 * 문자열 정렬하기 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */
public class Problem120850 {

  public int[] solution(String my_string) {
    return Arrays.stream(my_string.split(""))
        .filter(p -> p.matches("[-+]?\\d*\\.?\\d+"))
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();
  }

  /*public int[] solution(String myString) {
    return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split(""))
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();
  }*/
}
