package level1.p12000_12999;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 문자열 내림차순으로 배치하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
public class Problem12917 {

  public String solution(String s) {
    return s.chars()
        .mapToObj(i -> String.valueOf((char) i))
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.joining());
  }
}
