package level2.p17000_17999;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * [1차] 캐시
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/17680
 */
public class Problem17680 {

  public int solution(int cacheSize, String[] cities) {
    int answer = 0;

    Map<String, Boolean> lruCache = new LinkedHashMap<>(cacheSize, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<String, Boolean> eldest) {
        return size() > cacheSize;
      }
    };

    for (String city : cities) {

      String cityLower = city.toLowerCase();

      if (lruCache.containsKey(cityLower)) {
        answer += 1;
      } else {
        answer += 5;
      }

      lruCache.put(cityLower, true);
    }

    return answer;
  }
}
