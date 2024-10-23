package level0.p181800_181899;

/**
 * n보다 커질 때까지 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */
public class Problem181884 {

  public int solution(int[] numbers, int n) {
    int answer = 0;

    for (int i = 0; i < numbers.length; i++) {
      answer = answer + numbers[i];
      if (answer > n) {
        break;
      }
    }

    return answer;
  }
}
