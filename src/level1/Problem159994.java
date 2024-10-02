package level1;

/**
 * 카드 뭉치
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
public class Problem159994 {

  public String solution(String[] cards1, String[] cards2, String[] goal) {

    String answer = "Yes";

    int cards1Idx = 0;
    int cards2Idx = 0;

    for (int i = 0; i < goal.length; i++) {
      if (cards1Idx < cards1.length && cards1[cards1Idx].equals(goal[i])) {
        cards1Idx++;
      } else if (cards2Idx < cards2.length && cards2[cards2Idx].equals(goal[i])) {
        cards2Idx++;
      } else {
        answer = "No";
        break;
      }
    }

    return answer;
  }
}
