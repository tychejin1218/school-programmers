package level0.p181900_181999;

/**
 * 공배수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */
public class Problem181936 {

  public int solution(int number, int n, int m) {
    return number % n == 0 ? (number % m == 0 ? 1 : 0) : 0;
  }
}
