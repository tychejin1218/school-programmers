package level0.problem120000;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 문자 반복 출력하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class Problem120825 {

  public String solution(String my_string, int n) {
    return Arrays.stream(my_string.split(""))
        .map(p -> p.repeat(n))
        .collect(Collectors.joining());
  }
}
