package level0.problem120000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열 뒤집기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */
public class Problem120822 {

  public String solution(String my_string) {
    List<String> strList = Arrays.stream(my_string.split(""))
        .collect(Collectors.toList());
    Collections.reverse(strList);
    return strList.stream()
        .collect(Collectors.joining());
  }

  /*public String solution(String my_string) {
    StringBuilder sb = new StringBuilder();
    sb.append(my_string);
    sb.reverse();
    return sb.toString();
  }*/
}
