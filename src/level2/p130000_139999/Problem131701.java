package level2.p130000_139999;

import java.util.HashSet;
import java.util.Set;

/**
 * 연속 부분 수열 합의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/131701
 */
public class Problem131701 {

  public int solution(int[] elements) {

    Set<Integer> sumSet = new HashSet<>();

    int elementLen = elements.length;
    for (int len = 1; len <= elementLen; len++) {
      for (int idx = 0; idx < elementLen; idx++) {
        int sum = 0;
        for (int i = 0; i < len; i++) {
          sum += elements[(idx + i) % elementLen];
        }
        sumSet.add(sum);
      }
    }

    return sumSet.size();
  }
}
