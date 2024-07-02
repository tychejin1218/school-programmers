package level0.problem181900;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 글자 이어 붙여 문자열 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */
public class Problem181915 {

  public String solution(String my_string, int[] index_list) {
    return IntStream.range(0, index_list.length)
        .mapToObj(i -> String.valueOf(my_string.charAt(index_list[i])))
        .collect(Collectors.joining());
  }
}
