package level0.problem120000;

import java.util.Arrays;

/**
 * 문자열 밀기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */
public class Problem120921 {

  public int solution01(String A, String B) {
    int answer = -1;

    String[] aArr = Arrays.stream(A.split(""))
        .toArray(String[]::new);
    String[] bArr = Arrays.stream(B.split(""))
        .toArray(String[]::new);

    if (Arrays.equals(aArr, bArr)) {
      answer = 0;
    } else {
      int aArrLen = aArr.length;
      for (int a = 0; a < aArrLen; a++) {

        String lastValue = aArr[aArrLen - 1];
        for (int b = aArrLen - 1; b >= 1; b--) {
          aArr[b] = aArr[b - 1];
        }
        aArr[0] = lastValue;

        if (Arrays.equals(aArr, bArr)) {
          answer = a + 1;
          break;
        }
      }
    }

    return answer;
  }

  public int solution(String A, String B) {
    String repeatB = B.repeat(2);
    return repeatB.indexOf(A);
  }
}
