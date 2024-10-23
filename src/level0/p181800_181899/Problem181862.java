package level0.p181800_181899;

import java.util.Arrays;

/**
 * 세 개의 구분자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181862
 */
public class Problem181862 {

  public String[] solution(String myStr) {
    String[] answer = Arrays.stream(myStr.replaceAll("[abc]", "_").split("_"))
        .filter(s -> !s.isBlank())
        .toArray(String[]::new);
    return answer.length != 0 ? answer : new String[]{"EMPTY"};
  }
}
