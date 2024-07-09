package level0.problem181900;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 문자 리스트를 문자열로 변환하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */
public class Problem181941 {

  public String solution(String[] arr) {
    return Arrays.stream(arr)
        .collect(Collectors.joining());
  }
}
