package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 최댓값 만들기(1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */
public class Problem120847 {

  public int solution(int[] numbers) {
    List<Integer> numberList = Arrays.stream(numbers)
        .boxed()
        .collect(Collectors.toList());
    Collections.sort(numberList, Collections.reverseOrder());
    return numberList.get(0) * numberList.get(1);
  }
}
