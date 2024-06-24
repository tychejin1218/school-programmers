package level0.problem181800;

import java.util.stream.IntStream;

/**
 * 특별한 이차원 배열 2
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181831
 */
public class Problem181831 {

  public int solution01(int[][] arr) {
    int answer = 1;

    int n = arr.length;
    for (int a = 0; a < n; a++) {
      for (int b = 0; b < n; b++) {
        if (arr[a][b] != arr[b][a]) {
          answer = 0;
          break;
        }
      }
    }

    return answer;
  }

  public int solution(int[][] arr) {
    int n = arr.length;
    return IntStream.range(0, n)
        .allMatch(a ->
            IntStream.range(0, n)
                .allMatch(b -> arr[a][b] == arr[b][a])
        ) ? 1 : 0;
  }
}
