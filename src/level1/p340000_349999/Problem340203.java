package level1.p340000_349999;

/**
 * [PCCE 기출문제] 5번 / 심폐소생술
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340203
 */
public class Problem340203 {

  public int[] solution(String[] cpr) {
    int[] answer = {0, 0, 0, 0, 0};
    String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

    for (int i = 0; i < cpr.length; i++) {
      for (int j = 0; j < basic_order.length; j++) {
        if (cpr[i].equals(basic_order[j])) {
          answer[i] = j + 1;
          break;
        }
      }
    }
    return answer;
  }
}