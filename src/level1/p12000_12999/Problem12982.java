package level1.p12000_12999;

import java.util.Arrays;

/**
 * 예산
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12982
 */
public class Problem12982 {

  public int solution(int[] d, int budget) {
    int answer = 0;

    Arrays.sort(d);

    for (int i : d) {
      if (budget >= i) {
        budget -= i;
        answer++;
      } else {
        break;
      }
    }

    return answer;
  }
}
