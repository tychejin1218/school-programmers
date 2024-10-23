package level0.p181800_181899;

import java.util.Arrays;

/**
 * 문자열 잘라서 정렬하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */
public class Problem181866 {

  public String[] solution(String myString) {
    return Arrays.stream(myString.split("x"))
        .filter(str -> !str.isBlank())
        .sorted()
        .toArray(String[]::new);
  }
}
