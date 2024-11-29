package level2.p130000_139999;

import java.util.HashMap;
import java.util.Map;

/**
 * 할인 행사
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/131127
 */
public class Problem131127 {

  public int solution(String[] want, int[] number, String[] discount) {
    int answer = 0;

    Map<String, Integer> wantMap = new HashMap<>();
    for (int i = 0; i < want.length; i++) {
      wantMap.put(want[i], number[i]);
    }

    for (int i = 0; i <= discount.length - 10; i++) {

      Map<String, Integer> discountMap = new HashMap<>();
      for (int j = i; j < i + 10; j++) {
        discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
      }

      boolean canJoin = true;
      for (String product : wantMap.keySet()) {
        if (discountMap.getOrDefault(product, 0) < wantMap.get(product)) {
          canJoin = false;
          break;
        }
      }

      if (canJoin) {
        answer++;
      }
    }

    return answer;
  }
}
