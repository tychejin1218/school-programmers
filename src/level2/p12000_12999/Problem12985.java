package level2.p12000_12999;

/**
 * 예상 대진표
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */
public class Problem12985 {

  public int solution(int n, int a, int b) {

    int round = 0;

    while (a != b) {
      a = (a + 1) / 2;
      b = (b + 1) / 2;
      round++;
    }

    return round;
  }
}



