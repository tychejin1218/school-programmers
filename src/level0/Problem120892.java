package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 암호 해독
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120892
 */
public class Problem120892 {

  /*public String solution(String cipher, int code) {
    String answer = "";
    List<String> chipherList = Arrays.asList(cipher.split(""));
    for (int a = 1; a < chipherList.size() + 1; a++) {
      if (a % code == 0) {
        answer += chipherList.get(a - 1);
      }
    }
    return answer;
  }*/

  public String solution(String cipher, int code) {
    return IntStream.rangeClosed(0, cipher.length())
        .filter(p -> p % code == code - 1)
        .mapToObj(m -> String.valueOf(cipher.charAt(m)))
        .collect(Collectors.joining());
  }
}
