package level0.problem120000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * k의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120887
 */
public class Problem120887 {

  public int solution01(int i, int j, int k) {
    int answer = 0;

    for (int a = i; a <= j; a++) {

      int[] tempArr = Arrays.stream(String.valueOf(a).split(""))
          .mapToInt(m -> Integer.valueOf(m))
          .toArray();
      for (int b = 0; b < tempArr.length; b++) {
        if (tempArr[b] == k) {
          answer++;
        }
      }
    }

    return answer;
  }

  public int solution(int i, int j, int k) {
    return (int) IntStream.rangeClosed(i, j)
        .mapToObj(number ->
            Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .toArray())
        .flatMapToInt(numberArr -> Arrays.stream(numberArr))
        .filter(tempNumber -> tempNumber == k)
        .count();
  }
}
