package level1.p130000_139999;

import java.util.Arrays;
import java.util.List;

/**
 * 옹알이 (2)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */
public class Problem133499 {

  public int solution01(String[] babbling) {
    int answer = 0;

    List<String> allowedPatterns = Arrays.asList("aya", "ye", "woo", "ma");
    List<String> forbiddenPatterns = Arrays.asList("ayaaya", "yeye", "woowoo", "mama");

    for (String word : babbling) {
      boolean isAllowed = true;
      for (String forbiddenPattern : forbiddenPatterns) {
        if (word.contains(forbiddenPattern)) {
          isAllowed = false;
          break;
        }
      }
      if (isAllowed) {
        for (String allowedPattern : allowedPatterns) {
          word = word.replace(allowedPattern, "");
        }
        if (word.isEmpty()) {
          answer++;
        }
      }
    }

    return answer;
  }


  public int solution(String[] babbling) {
    int answer = 0;
    String[] sounds = {"aya", "ye", "woo", "ma"};

    for (String word : babbling) {
      String prevSound = "";
      boolean isValid = true;

      while (!word.isEmpty()) {
        boolean matchFound = false;

        for (String sound : sounds) {
          if (word.startsWith(sound)) {
            if (sound.equals(prevSound)) {
              isValid = false;
              break;
            }

            prevSound = sound;
            word = word.substring(sound.length());
            matchFound = true;
            break;
          }
        }

        if (!matchFound) {
          isValid = false;
          break;
        }
      }

      if (isValid) {
        answer++;
      }
    }

    return answer;
  }
}
