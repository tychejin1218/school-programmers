package level0.problem120000;

import java.util.Arrays;

/**
 * 배열 원소의 길이
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120854
 */
public class Problem120854 {

  /*public int[] solution(String[] strlist) {
    return Arrays.stream(strlist)
        .mapToInt(m -> m.length())
        .toArray();
  }*/

  public int[] solution(String[] strlist) {
    return Arrays.stream(strlist)
        .mapToInt(String::length)
        .toArray();
  }
}
