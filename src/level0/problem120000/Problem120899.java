package level0.problem120000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 가장 큰 수 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */
public class Problem120899 {

  public int[] solution(int[] array) {

    int max = Arrays.stream(array)
        .max()
        .getAsInt();

    int index = IntStream.rangeClosed(0, array.length)
        .filter(p -> array[p] == max)
        .findFirst()
        .getAsInt();

    return IntStream.of(max, index).toArray();
  }
}
