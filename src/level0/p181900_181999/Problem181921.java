package level0.p181900_181999;

import java.util.stream.IntStream;

/**
 * 카운트 업
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921
 */
public class Problem181921 {

  public int[] solution01(int l, int r) {
    return IntStream.rangeClosed(l, r)
        .filter(i -> i % 5 == 0
            && !(String.valueOf(i).contains("1")
            || String.valueOf(i).contains("2")
            || String.valueOf(i).contains("3")
            || String.valueOf(i).contains("4")
            || String.valueOf(i).contains("6")
            || String.valueOf(i).contains("7")
            || String.valueOf(i).contains("8")
            || String.valueOf(i).contains("9")
        ))
        .toArray();
  }

  public int[] solution(int l, int r) {
    return IntStream.rangeClosed(l, r)
        .filter(i -> i % 5 == 0 && String.valueOf(i).matches("[50]*"))
        .toArray();
  }
}
