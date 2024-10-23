package level0.p120000_129999;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * 구슬을 나누는 경우의 수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */
public class Problem120840 {

  public BigInteger solution(int balls, int share) {
    return getFactorial(balls).divide(
        getFactorial(balls - share).multiply(getFactorial(share))
    );
  }

  public BigInteger getFactorial(int n) {
    return IntStream.rangeClosed(1, n)
        .mapToObj(BigInteger::valueOf)
        .reduce(BigInteger::multiply)
        .orElse(BigInteger.ONE);
  }
}
