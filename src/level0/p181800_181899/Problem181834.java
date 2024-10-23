package level0.p181800_181899;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * l로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181834
 */
public class Problem181834 {

  public String solution01(String myString) {
    char[] myStrings = myString.toCharArray();
    return IntStream.range(0, myStrings.length)
        .mapToObj(i -> {
          if ((int) myStrings[i] < (int) "l".charAt(0)) {
            return "l";
          } else {
            return myStrings[i];
          }
        })
        .map(String::valueOf)
        .collect(Collectors.joining());
  }

  public String solution(String myString) {
    return myString.chars()
        .mapToObj(ch -> ch < 'l' ? 'l' : (char) ch)
        .map(String::valueOf)
        .collect(Collectors.joining());
  }
}
