package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 모음 제거
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */
public class Problem120849 {

  /*public String solution(String my_string) {
    return Arrays.stream(my_string.split(""))
        .filter(p -> !(p.equals("a")
            || p.equals("e")
            || p.equals("i")
            || p.equals("o")
            || p.equals("u")))
        .collect(Collectors.joining());
  }*/

  public String solution(String my_string) {
    return my_string.replaceAll("[aeiou]", "");
  }
}
