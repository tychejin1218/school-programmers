package level0.p181900_181999;

import java.util.stream.IntStream;

/**
 * 카운트 업
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */
public class Problem181920 {

  public int[] solution(int start_num, int end_num) {
    return IntStream.rangeClosed(start_num, end_num)
        .toArray();
  }
}
