package level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 달리기 경주
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */
public class Problem178871 {

  public String[] solution(String[] players, String[] callings) {

    Map<String, Integer> playersMap = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      playersMap.put(players[i], i);
    }

    for (String calledPlayer : callings) {
      int currentRank = playersMap.get(calledPlayer);
      if (currentRank > 0) {

        String frontPlayer = players[currentRank - 1];
        players[currentRank - 1] = calledPlayer;
        players[currentRank] = frontPlayer;

        playersMap.put(calledPlayer, currentRank - 1);
        playersMap.put(frontPlayer, currentRank);
      }
    }

    return players;
  }
}
