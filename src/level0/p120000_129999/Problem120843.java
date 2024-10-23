package level0.p120000_129999;

/**
 * 공 던지기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120843
 */
public class Problem120843 {

  /*public int solution(int[] numbers, int k) {
    int answer = 0;

    int order = 0;
    int repetition = 1;
    for (int a = 0; a < k; a++) {

      if (repetition == k) {
        answer = numbers[order];
        break;
      } else {
        repetition++;
      }

      order = order + 2;
      if (order >= numbers.length) {
        order = order - numbers.length;
      }
    }

    return answer;
  }*/

  public int solution(int[] numbers, int k) {
    return numbers[((1 + ((k - 1) * 2)) % numbers.length) - 1];
  }
}
