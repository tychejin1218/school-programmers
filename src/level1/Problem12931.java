package level1;

import java.util.Arrays;

/**
 * 자릿수 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Problem12931 {

  public int solution01(int n) {
    return String.valueOf(n).chars()
        .map(Character::getNumericValue)
        .sum();
  }

  public int solution(int n) {
    return Arrays.stream(String.valueOf(n).split(""))
        .map(ch -> Character.getNumericValue(ch.charAt(0)))
        .reduce(0, Integer::sum);
  }
}
