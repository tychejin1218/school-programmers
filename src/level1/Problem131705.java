package level1;

/**
 * 삼총사
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */
public class Problem131705 {

  public int solution(int[] number) {
    int answer = 0;

    for (int i = 0; i < number.length - 2; i++) {
      for (int j = i + 1; j < number.length - 1; j++) {
        for (int k = j + 1; k < number.length; k++) {
          int sum = number[i] + number[j] + number[k];
          if (sum == 0) {
            answer++;
          }
        }
      }
    }

    return answer;
  }
}
