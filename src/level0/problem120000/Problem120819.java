package level0.problem120000;

/**
 * 아이스 아메리카노
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120819
 */
public class Problem120819 {

  public int[] solution(int money) {
    int quotient = money / 5500;
    int remainder = money % 5500;
    return new int[]{quotient, remainder};
  }
}
