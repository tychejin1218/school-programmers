package level0.p120000_129999;

import java.util.stream.IntStream;

/**
 * 짝수는 싫어요
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */
public class Problem120813 {

  /*public int[] solution(int n) {

    List<Integer> results = new ArrayList<>();
    for (int a = 1; a <= n; a++) {
      if (a % 2 != 0) {
        results.add(a);
      }
    }

    return results.stream().mapToInt(i->i).toArray();
  }*/

  public int[] solution(int n) {
    return IntStream.rangeClosed(0, n)
        .filter(p -> p % 2 != 0)
        .toArray();
  }
}
