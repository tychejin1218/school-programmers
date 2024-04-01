package level0.problem120000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열 뒤집기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class Problem120821 {

  public int[] solution(int[] num_list) {
    List<Integer> list = Arrays.stream(num_list)
        .boxed()
        .collect(Collectors.toList());
    Collections.reverse(list);
    return list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
