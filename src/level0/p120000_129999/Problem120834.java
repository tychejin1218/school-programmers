package level0.p120000_129999;

import java.util.stream.Collectors;

/**
 * 외계행성의 나이
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120834
 */
public class Problem120834 {

  /*public String solution(int age) {
    String[] ageStr = String.valueOf(age).split("");
    return Arrays.stream(ageStr)
        .map(m -> String.valueOf((char) (Integer.valueOf(m.charAt(0)) + 49)))
        .collect(Collectors.joining());
  }*/

  public String solution(int age) {
    return String.valueOf(age).chars()
        .mapToObj(m -> String.valueOf((char) (m + 49)))
        .collect(Collectors.joining());
  }
}
