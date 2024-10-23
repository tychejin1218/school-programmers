package level1.p170000_179999;

import java.util.HashMap;
import java.util.Map;

/**
 * 추억 점수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */
public class Problem176963 {

  public int[] solution(String[] name, int[] yearning, String[][] photo) {

    int[] answer = new int[photo.length];

    Map<String, Integer> nameMap = new HashMap<>();
    for (int i = 0; i < name.length; i++) {
      nameMap.put(name[i], yearning[i]);
    }

    for (int i = 0; i < photo.length; i++) {
      for (int j = 0; j < photo[i].length; j++) {
        answer[i] += nameMap.getOrDefault(photo[i][j], 0);
      }
    }

    return answer;
  }
}
