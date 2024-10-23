package level0.p120000_129999;

import java.util.stream.IntStream;

/**
 * 합성수 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */
public class Problem120846 {

  public int solution(int n) {
    return (int) IntStream.rangeClosed(1, n)
        .filter(a ->
            IntStream.rangeClosed(1, a)
                .filter(b -> a % b == 0)
                .count() >= 3)
        .count();
  }
}
