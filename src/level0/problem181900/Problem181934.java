package level0.problem181900;

/**
 * 조건 문자열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class Problem181934 {

  public int solution(String ineq, String eq, int n, int m) {

    if (">".equals(ineq)) {
      if ("=".equals(eq)) {
        return n >= m ? 1 : 0;
      } else {
        return n > m ? 1 : 0;
      }
    } else {
      if ("=".equals(eq)) {
        return n <= m ? 1 : 0;
      } else {
        return n < m ? 1 : 0;
      }
    }
  }
}
