package level0.p181900_181999;

import java.util.Arrays;

/**
 * 배열 만들기 5
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */
public class Problem181912 {

  public int[] solution(String[] intStrs, int k, int s, int l) {
    return Arrays.stream(intStrs)
        .mapToInt(intStr -> Integer.valueOf(intStr.substring(s, s + l)))
        .filter(i -> i > k)
        .toArray();
  }
}
