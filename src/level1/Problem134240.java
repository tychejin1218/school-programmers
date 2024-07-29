package level1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 푸드 파이트 대회
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */
public class Problem134240 {

  public String solution(int[] food) {

    List<Integer> foodList = IntStream.range(1, food.length)
        .flatMap(i -> IntStream.range(0, food[i] / 2).map(j -> i))
        .boxed()
        .collect(Collectors.toList());

    String startStr = foodList.stream()
        .map(i -> i.toString())
        .collect(Collectors.joining());

    String midStr = Stream.generate(() -> "0")
        .limit(food[0])
        .collect(Collectors.joining());

    String endStr = foodList.stream()
        .sorted(Comparator.reverseOrder())
        .map(i -> i.toString())
        .collect(Collectors.joining());

    return startStr + midStr + endStr;
  }
}
