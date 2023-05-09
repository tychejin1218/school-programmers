package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 문자열 정렬하기 (2)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */
public class Problem120911 {

  public String solution(String my_string) {
    return Arrays.stream(my_string.toLowerCase().split(""))
        .sorted()
        .collect(Collectors.joining());
  }
}
