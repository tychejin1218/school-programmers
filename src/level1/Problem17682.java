package level1;

import java.util.Arrays;

/**
 * [1차] 다트게임
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/17682
 */
public class Problem17682 {

  public int solution(String dartResult) {

    int[] scoreArr = new int[3];
    int scoreIdx = -1;
    for (int i = 0; i < dartResult.length(); i++) {
      char dartChar = dartResult.charAt(i);
      if (dartChar >= '0' && dartChar <= '9') {
        scoreIdx++;
        if (dartChar == '1' && dartResult.charAt(i + 1) == '0') {
          scoreArr[scoreIdx] = 10;
          i++;
        } else {
          scoreArr[scoreIdx] = dartChar - '0';
        }
      }

      if (dartChar == 'D') {
        scoreArr[scoreIdx] = (int) Math.pow(scoreArr[scoreIdx], 2);
      }
      if (dartChar == 'T') {
        scoreArr[scoreIdx] = (int) Math.pow(scoreArr[scoreIdx], 3);
      }

      if (dartChar == '*') {
        if (scoreIdx > 0) {
          scoreArr[scoreIdx - 1] *= 2;
        }
        scoreArr[scoreIdx] *= 2;
      }
      if (dartChar == '#') {
        scoreArr[scoreIdx] *= -1;
      }
    }

    return Arrays.stream(scoreArr).sum();
  }
}
