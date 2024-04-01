package level0.problem120000;

/**
 * 제곱수 판별하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */
public class Problem120909 {

  public int solution(int n) {
    return Math.sqrt(n) % 1 == 0 ? 1 : 2;
  }
}
