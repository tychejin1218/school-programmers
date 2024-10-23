package level0.p120000_129999;

import java.util.Arrays;

/**
 * 중복된 숫자 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */
public class Problem120583 {

  /*public int solution(int[] array, int n) {

    int answer = 0;

    for (int a = 0; a < array.length; a++) {
      if (array[a] == n) {
        answer++;
      }
    }

    return answer;
  }*/

  /*public int solution(int[] array, int n) {
    int answer = 0;

    for (int num : array) {
      if (num == n) {
        answer++;
      }
    }

    return answer;
  }*/

  public int solution(int[] array, int n) {
    return (int) Arrays.stream(array)
        .filter(num -> num == n)
        .count();
  }
}
