package level0.problem181900;

import java.util.stream.IntStream;

/**
 * 홀짝에 따라 다른 값 반환하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */
public class Problem181935 {

  public int solution(int n) {
    return n % 2 == 0 ?
        IntStream.rangeClosed(0, n)
            .filter(i -> i % 2 == 0)
            .map(i -> (int) Math.pow(i, 2))
            .sum() :
        IntStream.rangeClosed(0, n)
            .filter(i -> i % 2 != 0)
            .sum();
  }
}
