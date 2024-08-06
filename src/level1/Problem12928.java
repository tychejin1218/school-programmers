package level1;

import java.util.stream.IntStream;

/**
 * 약수의 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class Problem12928 {

  public int solution(int n) {
    return IntStream.rangeClosed(1, n)
        .filter(i -> n % i == 0)
        .sum();
  }
}
