package level0.problem180000;

import java.util.stream.IntStream;

/**
 * 리스트 자르기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */
public class Problem181897 {

  public int[] solution(int n, int[] slicer, int[] num_list) {

    int[] answer = {};

    if (n == 1) {
      answer = IntStream.rangeClosed(0, slicer[1])
          .map(i -> num_list[i])
          .toArray();
    } else if (n == 2) {
      answer = IntStream.rangeClosed(slicer[0], num_list.length - 1)
          .map(i -> num_list[i])
          .toArray();
    } else if (n == 3) {
      answer = IntStream.rangeClosed(slicer[0], slicer[1])
          .map(i -> num_list[i])
          .toArray();
    } else if (n == 4) {
      answer = IntStream.iterate(slicer[0], i -> i + 2)
          .takeWhile(i -> i <= slicer[1])
          .map(i -> num_list[i])
          .toArray();
    }

    return answer;
  }
}
