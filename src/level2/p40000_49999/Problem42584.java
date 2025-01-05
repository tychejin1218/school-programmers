package level2.p40000_49999;

/**
 * 주식가격
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 */
public class Problem42584 {

  public int[] solution(int[] prices) {

    int[] answer = new int[prices.length];

    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        answer[i]++;
        if (prices[i] > prices[j]) {
          break;
        }
      }
    }

    return answer;
  }
}