package level0.problem180000;

import java.util.Arrays;

/**
 * x 사이의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */
public class Problem181867 {

  public int[] solution(String myString) {
    return Arrays.stream(myString.split("x", -1))
        .map(p -> p.length())
        .mapToInt(p -> p)
        .toArray();
  }
}
