package level0.problem180000;

import java.util.stream.IntStream;

/**
 * 5명씩
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */
public class Problem181886 {

  public String[] solution(String[] names) {
    return IntStream.range(0, names.length)
        .filter(i -> i % 5 == 0)
        .mapToObj(i -> names[i])
        .toArray(String[]::new);
  }
}
