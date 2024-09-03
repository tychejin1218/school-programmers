package level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 약수의 개수와 덧셈
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 */
public class Problem77884 {

  public int solution(int left, int right) {

    List<Integer> answerList = new ArrayList<>();

    for (int i = left; i <= right; i++) {
      for (int j = 1; j <= i; j++) {
        int count = 0;
        for (int k = 1; k * k <= j; k++) {
          if (j % k == 0) {
            count++;
            if (j / k != k) {
              count++;
            }
          }
        }
        if (j == i) {
          if (count % 2 == 0) {
            answerList.add(i);
          } else {
            answerList.add(i * -1);
          }
        }
      }
    }

    return answerList.stream()
        .mapToInt(Integer::intValue)
        .sum();
  }
}
