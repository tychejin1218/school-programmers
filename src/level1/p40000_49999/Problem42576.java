package level1.p40000_49999;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Problem42576 {

  public String solution(String[] participant, String[] completion) {
    HashMap<String, Integer> participantMap = new HashMap<>();
    for (String player : participant) {
      participantMap.put(player, participantMap.getOrDefault(player, 0) + 1);
    }
    for (String player : completion) {
      participantMap.put(player, participantMap.get(player) - 1);
    }
    return participantMap.entrySet().stream()
        .filter(entry -> entry.getValue() != 0)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse("");
  }
}
