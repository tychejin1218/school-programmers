package level0.p120000_129999;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 중복된 문자 제거
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */
public class Problem120888 {

  public String solution(String my_string) {
    return Arrays.stream(my_string.split(""))
        .distinct()
        .collect(Collectors.joining());
  }
}
