package level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 약수 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */
public class Problem120897 {

  public int[] solution(int n) {

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
}
