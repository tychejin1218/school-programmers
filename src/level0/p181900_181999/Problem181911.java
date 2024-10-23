package level0.p181900_181999;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 부분 문자열 이어 붙여 문자열 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181911
 */
public class Problem181911 {

  public String solution(String[] my_strings, int[][] parts) {
    return IntStream.range(0, my_strings.length)
        .mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1))
        .collect(Collectors.joining());
  }
}
