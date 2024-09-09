package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 숫자 짝꿍
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */
public class Problem131128 {

  public String solution01(String X, String Y) {

    List<Integer> matchNumList = new ArrayList<>();

    char[] xChars = X.toCharArray();
    char[] yChars = Y.toCharArray();
    for (int i = 0; i < xChars.length; i++) {
      for (int j = 0; j < yChars.length; j++) {
        if (xChars[i] == yChars[j]) {
          matchNumList.add(Character.getNumericValue(xChars[i]));
          yChars[j] = '-';
          break;
        }
      }
    }

    if (matchNumList.isEmpty()) {
      return "-1";
    } else if (matchNumList.get(0) == 0) {
      return "0";
    } else {
      matchNumList.sort(Collections.reverseOrder());
      return matchNumList.stream()
          .map(String::valueOf)
          .collect(Collectors.joining(""));
    }
  }

  public String solution(String X, String Y) {

    int[] countX = new int[10];
    int[] countY = new int[10];

    for (char ch : X.toCharArray()) {
      countX[ch - '0']++;
    }
    for (char ch : Y.toCharArray()) {
      countY[ch - '0']++;
    }

    StringBuilder result = new StringBuilder();
    for (int i = 9; i >= 0; i--) {
      int minCount = Math.min(countX[i], countY[i]);
      for (int j = 0; j < minCount; j++) {
        result.append(i);
      }
    }

    if (result.length() == 0) {
      return "-1";
    }

    if (result.charAt(0) == '0') {
      return "0";
    }

    return result.toString();
  }
}
