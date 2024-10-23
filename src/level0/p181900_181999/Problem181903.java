package level0.p181900_181999;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * qr code
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */
public class Problem181903 {

  public String solution(int q, int r, String code) {
    String[] codes = code.split("");
    return IntStream.range(0, codes.length)
        .filter(i -> (i % q == r))
        .mapToObj(i -> codes[i])
        .collect(Collectors.joining());
  }
}
