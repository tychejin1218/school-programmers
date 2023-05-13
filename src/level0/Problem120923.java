package level0;

/**
 * 연속된 수의 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */
public class Problem120923 {

  public int[] solution(int num, int total) {
    int[] answer = new int[num];

    int tempValue = (total / num) - (num - 1) / 2;
    for (int a = 0; a < num; a++) {
      answer[a] = tempValue;
      tempValue++;
    }

    return answer;
  }
}
