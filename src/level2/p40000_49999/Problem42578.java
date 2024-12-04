package level2.p40000_49999;

import java.util.HashMap;
import java.util.Map;

/**
 * 의상
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Problem42578 {

  public int solution(String[][] clothes) {

    Map<String, Integer> clothesMap = new HashMap<>();

    for (String[] cloth : clothes) {
      String category = cloth[1];
      clothesMap.put(category, clothesMap.getOrDefault(category, 0) + 1);
    }

    int combinations = 1;
    for (int count : clothesMap.values()) {
      combinations *= (count + 1);
    }

    return combinations - 1;
  }
}
