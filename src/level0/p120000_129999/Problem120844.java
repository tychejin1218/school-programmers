package level0.p120000_129999;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열 회전시키기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */
public class Problem120844 {

  public int[] solution(int[] numbers, String direction) {

    List<Integer> numberList = Arrays.stream(numbers)
        .boxed()
        .collect(Collectors.toList());

    if ("right".equals(direction)) {
      Collections.rotate(numberList, 1);
    } else {
      Collections.rotate(numberList, -1);
    }

    return numberList.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
