package level0.p181900_181999;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문자열 곱하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
public class Problem181940 {

  public String solution01(String my_string, int k) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < k; i++) {
      sb.append(my_string);
    }
    return sb.toString();
  }

  public String solution(String my_string, int k) {
    return Stream.generate(() -> my_string)
        .limit(k)
        .collect(Collectors.joining());
  }
}
