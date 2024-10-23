package level0.p181800_181899;

import java.util.stream.IntStream;

/**
 * A 강조하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181875
 */
public class Problem181875 {

  public String[] solution(String[] strArr) {
    return IntStream.range(0, strArr.length)
        .mapToObj(i -> {
          String str = "";
          if (i % 2 == 0) {
            str = strArr[i].toLowerCase();
          } else {
            str = strArr[i].toUpperCase();
          }
          return str;
        })
        .toArray(String[]::new);
  }
}
