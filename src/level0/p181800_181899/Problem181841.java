package level0.p181800_181899;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 꼬리 문자열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181841
 */
public class Problem181841 {

  public String solution01(String[] str_list, String ex) {
    return Arrays.stream(str_list)
        .map(str -> str.contains(ex) ? "" : str)
        .collect(Collectors.joining());
  }

  public String solution(String[] str_list, String ex) {
    return Arrays.stream(str_list)
        .filter(str -> !str.contains(ex))
        .collect(Collectors.joining());
  }
}
