package level0.problem181900;

/**
 * 두 수의 연산값 비교하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */
public class Problem181938 {

  public int solution(int a, int b) {
    int value01 = Integer.parseInt(a + "" + b);
    int value02 = 2 * a * b;
    return Math.max(value01, value02);
  }
}
