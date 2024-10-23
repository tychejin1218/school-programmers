package level0.p181800_181899;

import java.util.Arrays;

/**
 * ad 제거하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */
public class Problem181870 {

  public String[] solution(String[] strArr) {
    return Arrays.stream(strArr)
        .filter(p -> !p.contains("ad"))
        .toArray(String[]::new);
  }
}
