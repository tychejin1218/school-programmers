package level0.problem180000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * n 번째 원소부터
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */
public class Problem181893 {

  public int[] solution01(int[] arr, int[] query) {

    for (int i = 0; i < query.length; i++) {

      int num = query[i];

      if (i % 2 == 0) {
        for (int j = num + 1; j < arr.length; j++) {
          arr[j] = 101;
        }
      } else {
        for (int j = 0; j < num; j++) {
          arr[j] = 101;
        }
      }

      arr = Arrays.stream(arr)
          .filter(p -> p != 101)
          .toArray();
    }

    return arr;
  }

  public int[] solution(int[] arr, int[] query) {
    return IntStream.range(0, query.length)
        .boxed()
        .reduce(arr, (current, next) -> next % 2 == 0 ?
                Arrays.copyOfRange(current, 0, query[next] + 1) :
                Arrays.copyOfRange(current, query[next], current.length),
            (a, b) -> a);
  }
}
