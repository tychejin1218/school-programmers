package level0.p120000_129999;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 7의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120912
 */
public class Problem120912 {

  public int solution01(int[] array) {
    return IntStream.range(0, array.length)
        .mapToObj(index -> (int) Arrays.stream(String.valueOf(array[index]).split(""))
            .filter(value -> value.equals("7"))
            .count())
        .reduce(0, Integer::sum);
  }

  public int solution(int[] array) {
    return (int) Arrays.stream(
            Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .split("")
        )
        .filter(s -> s.equals("7"))
        .count();
  }
}
