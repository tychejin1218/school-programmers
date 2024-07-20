package level0.problem181900;

/**
 * 공배수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */
public class Problem181937 {

  public int solution(int number, int n, int m) {
    return number % n == 0 ? (number % m == 0 ? 1 : 0) : 0;
  }
}
