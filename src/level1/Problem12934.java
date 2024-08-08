package level1;

/**
 * 정수 제곱근 판별
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class Problem12934 {

  public long solution01(long n) {
    double x = Math.sqrt(n);
    long xAsLong = (long) x;
    return (xAsLong * xAsLong == n) ? (long) Math.pow(xAsLong + 1, 2) : -1;
  }

  public long solution(long n) {
    for (long i = 1; i <= n / 2; i++) {
      if (i * i == n) {
        return (i + 1) * (i + 1);
      }
    }
    return -1;
  }
}
