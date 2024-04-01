package level0.problem120000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * n의 배수 고르기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */
public class Problem120905 {

  public int[] solution(int n, int[] numlist) {
    return Arrays.stream(numlist)
        .filter(value -> value % n == 0)
        .toArray();
  }

  public int[] solution01(int n, int[] numlist) {
    return IntStream.range(0, numlist.length)
        .map(index -> numlist[index])
        .filter(value -> value % n == 0)
        .toArray();
  }
}
