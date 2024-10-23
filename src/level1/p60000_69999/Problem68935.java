package level1.p60000_69999;

/**
 * 3진법 뒤집기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Problem68935 {

  public int solution(int n) {
    return Integer.parseInt(
        new StringBuffer(Integer.toString(n, 3))
            .reverse().toString(), 3);
  }
}
