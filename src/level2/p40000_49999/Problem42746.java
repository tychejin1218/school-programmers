package level2.p40000_49999;

import java.util.Arrays;

/**
 * 가장 큰 수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42746
 */
public class Problem42746 {

  public String solution(int[] numbers) {

    String[] sNum = Arrays.stream(numbers)
        .mapToObj(String::valueOf)
        .toArray(String[]::new);

    Arrays.sort(sNum, (x, y) -> (y + x).compareTo(x + y));

    if (sNum[0].charAt(0) == '0') {
      return "0";
    }

    return String.join("", sNum);
  }
}
