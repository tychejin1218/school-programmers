package level1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 서울에서 김서방 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class Problem12919 {

  public String solution01(String[] seoul) {
    OptionalInt index = IntStream.range(0, seoul.length)
        .filter(i -> "Kim".equals(seoul[i]))
        .findFirst();
    return String.format("김서방은 %s에 있다", index.getAsInt());
  }

  public String solution(String[] seoul) {
    int index = Arrays.asList(seoul).indexOf("Kim");
    return String.format("김서방은 %s에 있다", index);
  }
}
