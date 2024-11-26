package level2.p130000_139999;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 귤 고르기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */
public class Problem138476 {

  public int solution(int k, int[] tangerine) {

    int answer = 0;

    Map<Integer, Integer> tangerineMap = new HashMap<>();
    for (int tempTangerine : tangerine) {
      tangerineMap.put(tempTangerine, tangerineMap.getOrDefault(tempTangerine, 0) + 1);
    }

    List<Integer> tangerineList = new ArrayList<>(tangerineMap.values());
    tangerineList.sort(Comparator.reverseOrder());

    for (int tempTangerine : tangerineList) {
      k -= tempTangerine;
      answer++;
      if (k <= 0) {
        break;
      }
    }

    return answer;
  }

//  public int solution(int k, int[] tangerine) {
//
//    int answer = 0;
//
//    Map<Integer, Integer> tangerineMap = new HashMap<>();
//    for (int tempTangerine : tangerine) {
//      tangerineMap.put(tempTangerine, tangerineMap.getOrDefault(tempTangerine, 0) + 1);
//    }
//
//    List<Entry<Integer, Integer>> tangerineList = new ArrayList<>(tangerineMap.entrySet());
//    tangerineList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
//
//    for (Map.Entry<Integer, Integer> entry : tangerineList) {
//      k -= entry.getValue();
//      answer++;
//      if (k <= 0) break;
//    }
//
//    return answer;
//  }
}
