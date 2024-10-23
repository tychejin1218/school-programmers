package level0.p181800_181899;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 카운트 다운
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181899
 */
public class Problem181899 {

  public int[] solution01(int start_num, int end_num) {
    int[] answer = new int[start_num - end_num + 1];
    int idx = 0;

    for (int i = start_num; i >= end_num; i--) {
      answer[idx] = i;
      idx++;
    }

    return answer;
  }

  public int[] solution(int start_num, int end_num) {
    return IntStream.rangeClosed(end_num, start_num)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
