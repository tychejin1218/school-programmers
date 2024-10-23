package level1.p140000_149999;

import java.util.HashMap;
import java.util.Map;

/**
 * 크기가 작은 부분문자열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */
public class Problem142086 {

  public int[] solution(String s) {

    int[] answer = new int[s.length()];

    Map<Character, Integer> lastIndexMap = new HashMap<>();
    char[] characters = s.toCharArray();

    char[] myChars = s.toCharArray();
    for (int i = 0; i < characters.length; i++) {
      int lastIndex = lastIndexMap.getOrDefault(characters[i], -1);

      if (lastIndex == -1) {
        answer[i] = lastIndex;
      } else {
        answer[i] = i - lastIndex;
      }

      lastIndexMap.put(myChars[i], i);
    }

    return answer;
  }
}
