package level0;

/**
 * 피자 나눠 먹기 (3)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */
public class Problem120816 {

  public int solution(int slice, int n) {
    int quotient = n / slice;
    int remainder = n % slice;
    return remainder > 0 ? quotient + 1 :quotient;
  }
}
