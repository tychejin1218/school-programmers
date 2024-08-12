package level1;

import java.util.stream.IntStream;

/**
 * x만큼 간격이 있는 n개의 숫자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Problem12954 {

  public long[] solution(int x, int n) {
    return IntStream.rangeClosed(1, n)
        .mapToLong(i -> (long) x * i)
        .toArray();
  }
}
