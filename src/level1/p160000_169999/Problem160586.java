package level1.p160000_169999;

import java.util.HashMap;
import java.util.Map;

/**
 * 대충 만든 자판
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/160586
 */
public class Problem160586 {

  public int[] solution(String[] keymap, String[] targets) {

    int[] answer = new int[targets.length];
    Map<Character, Integer> tempMap = new HashMap<>();

    for (String tempKeymap : keymap) {
      for (int i = 0; i < tempKeymap.length(); i++) {
        char c = tempKeymap.charAt(i);
        int tempVal = tempMap.getOrDefault(c, i + 1);
        tempMap.put(c, Math.min(tempVal, i + 1));
      }
    }

    for (int i = 0; i < targets.length; i++) {
      String target = targets[i];
      int totalPress = 0;
      boolean canType = true;

      for (int j = 0; j < target.length(); j++) {
        char c = target.charAt(j);
        if (tempMap.containsKey(c)) {
          totalPress += tempMap.get(c);
        } else {
          canType = false;
          break;
        }
      }

      answer[i] = canType ? totalPress : -1;
    }

    return answer;
  }
}
