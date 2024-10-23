package level1.p70000_79999;

import java.util.stream.IntStream;

/**
 * 음양 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class Problem76501 {

  public int solution(int[] absolutes, boolean[] signs) {
    return IntStream.range(0, absolutes.length)
        .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
        .sum();
  }
}
