package level0.problem181800;

import java.util.Arrays;

/**
 * 공백으로 구분하기 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181869
 */
public class Problem181869 {

  public String[] solution(String my_string) {
    return Arrays.stream(my_string.split(" "))
        .toArray(String[]::new);
  }
}
