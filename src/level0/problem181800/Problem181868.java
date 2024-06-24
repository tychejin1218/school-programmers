package level0.problem181800;

import java.util.Arrays;

/**
 * 공백으로 구분하기 2
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */
public class Problem181868 {

  public String[] solution(String my_string) {
    return Arrays.stream(my_string.split(" ", -1))
        .filter(p -> p.length() > 0)
        .toArray(String[]::new);
  }
}
