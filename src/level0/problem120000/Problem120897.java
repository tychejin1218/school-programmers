package level0.problem120000;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 약수 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */
public class Problem120897 {

  public int[] solution01(int n) {

    List<Integer> divisorList = new ArrayList<>();
    for (int a = 1; a <= n; a++) {
      if (n % a == 0) {
        divisorList.add(a);
      }
    }

    return divisorList.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public int[] solution(int n) {
    return IntStream.rangeClosed(1, n)
        .filter(p -> n % p == 0)
        .toArray();
  }
}
