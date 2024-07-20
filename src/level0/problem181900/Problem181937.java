package level0.problem181900;

/**
 * n의 배수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */
public class Problem181937 {

  public int solution(int num, int n) {
    return num % n == 0 ? 1 : 0;
  }
}
