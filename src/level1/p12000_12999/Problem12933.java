package level1.p12000_12999;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 자연수 뒤집어 배열로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Problem12933 {

  public long solution(long n) {
    return Long.valueOf(
        Arrays.stream(String.valueOf(n).split(""))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining()));
  }
}
