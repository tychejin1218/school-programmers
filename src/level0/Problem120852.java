package level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 소인수분해
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852
 */
public class Problem120852 {

  public int[] solution(int n) {

    List<Integer> answers = new ArrayList<>();
    for (int a = 2; a <= n; a++) {
      while (n % a == 0) {
        answers.add(a);
        n = n / a;
      }
    }

    return answers.stream().distinct()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
