package level0.problem180000;

/**
 * 주사위 게임 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */
public class Problem181839 {

  public int solution(int a, int b) {
    int answer = 0;

    Boolean isAOdd = a % 2 != 0 ? true : false;
    Boolean isBOdd = b % 2 != 0 ? true : false;

    if (isAOdd && isBOdd) {
      answer = (a * a) + (b * b);
    } else if (isAOdd || isBOdd) {
      answer = 2 * (a + b);
    } else if (!isAOdd && !isBOdd) {
      answer = Math.abs(a - b);
    }

    return answer;
  }
}
