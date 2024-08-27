package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 실패율
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */
public class Problem42889 {

  public int[] solution(int N, int[] stages) {

    Map<Integer, Integer> stageMap = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      stageMap.put(i, 0);
    }
    for (int stage : stages) {
      if (stage <= N) {
        stageMap.put(stage, stageMap.getOrDefault(stage, 0) + 1);
      }
    }

    Map<Integer, Double> failureRateMap = new HashMap<>();
    int stagePlayerCount = stages.length;
    for (int stage : stageMap.keySet()) {
      int unclearedPlayerCount = stageMap.get(stage);
      if (stagePlayerCount != 0) {
        failureRateMap.put(stage, (double) unclearedPlayerCount / stagePlayerCount);
      } else {
        failureRateMap.put(stage, 0.0);
      }
      stagePlayerCount -= unclearedPlayerCount;
    }

    return failureRateMap.entrySet().stream()
        .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
        .mapToInt(Map.Entry::getKey)
        .toArray();
  }
}
