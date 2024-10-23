package level0.p181900_181999;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문자열 섞기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class Problem181942_1 {

  public String solution(String str1, String str2) {
    return IntStream.range(0, str1.length())
        .mapToObj(i -> String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i)))
        .collect(Collectors.joining());
  }
}
