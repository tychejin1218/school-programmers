package level0.problem180000;

import java.util.Arrays;

/**
 * 정수 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181840
 */
public class Problem181840 {

  public int solution(int[] num_list, int n) {
    return Arrays.stream(num_list)
        .anyMatch(num -> num == n) ? 1 : 0;
  }
}
