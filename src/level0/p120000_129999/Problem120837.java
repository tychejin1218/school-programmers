package level0.p120000_129999;

/**
 * 개미 군단
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */
public class Problem120837 {

  public int solution(int hp) {
    return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
  }
}
