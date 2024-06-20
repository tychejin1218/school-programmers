package level0.problem180000;

import java.util.stream.IntStream;

/**
 * 가까운 1 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */
public class Problem181898 {

  public int solution01(int[] arr, int idx) {
    int answer = -1;

    for (int i = idx; i < arr.length; i++) {
      if (arr[i] == 1) {
        answer = i;
        break;
      }
    }

    return answer;
  }

  public int solution(int[] arr, int idx) {
    return IntStream.range(idx, arr.length)
        .filter(i -> arr[i] == 1)
        .findFirst()
        .orElse(-1);
  }
}
