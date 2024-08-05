package level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 수박수박수박수박수박수?
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Problem12922 {

  public String solution(int n) {
    return IntStream.range(0, n)
        .mapToObj(i -> (i % 2 == 0) ? "수" : "박")
        .collect(Collectors.joining());
  }
}
