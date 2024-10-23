package level0.p181800_181899;

import java.util.stream.IntStream;

/**
 * 첫 번째로 나오는 음수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181896
 */
public class Problem181896 {

  public int solution(int[] num_list) {
    return IntStream.range(0, num_list.length)
        .filter(i -> num_list[i] < 0)
        .findFirst()
        .orElse(-1);
  }
}
