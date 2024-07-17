package level0.problem181900;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 이어 붙인 수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */
public class Problem181928 {

  public int solution(int[] num_list) {

    String oddStr = Arrays.stream(num_list)
        .filter(i -> i % 2 == 0)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining());

    String evenStr = Arrays.stream(num_list)
        .filter(i -> i % 2 != 0)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining());

    return Integer.parseInt(oddStr) + Integer.parseInt(evenStr);
  }
}
