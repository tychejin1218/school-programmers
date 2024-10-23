package level0.p181800_181899;

import java.util.stream.IntStream;

/**
 * 5명씩
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/1818856
 */
public class Problem181886 {

  public String[] solution(String[] names) {
    return IntStream.range(0, names.length)
        .filter(i -> i % 5 == 0)
        .mapToObj(i -> names[i])
        .toArray(String[]::new);
  }
}
