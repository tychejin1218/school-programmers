package level0.p120000_129999;

/**
 * 주사위의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120845
 */
public class Problem120845 {

  public int solution(int[] box, int n) {
    return (box[0] / n) * (box[1] / n) * (box[2] / n);
  }
}