package level0.problem181900;

import java.util.stream.IntStream;

/**
 * 글자 지우기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */
public class Problem181900 {

  public String solution(String my_string, int[] indices) {
    String[] myStrings = my_string.split("");
    IntStream.range(0, indices.length)
        .forEach(i -> myStrings[indices[i]] = "");
    return String.join("", myStrings);
  }
}
