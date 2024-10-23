package level1.p12000_12999;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
public class Problem12915 {

  public String[] solution(String[] strings, int n) {
    return Arrays.stream(strings)
        .map(i -> i.substring(n, n + 1) + i)
        .sorted()
        .map(i -> i.substring(1, i.length()))
        .toArray(String[]::new);
  }
}
