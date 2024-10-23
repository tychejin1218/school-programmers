package level1.p12000_12999;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 소수 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 */
public class Problem12921 {

  public int solution01(int n) {

    int answer = 0;

    for (int i = 2; i <= n; i++) {
      boolean prime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          prime = false;
          break;
        }
      }
      if (prime) {
        answer++;
      }
    }

    return answer;
  }

  public int solution(int n) {

    boolean[] isAnswers = new boolean[n + 1];
    Arrays.fill(isAnswers, true);
    isAnswers[0] = isAnswers[1] = false;

    for (int i = 2; i * i <= n; i++) {
      if (isAnswers[i]) {
        for (int j = i * i; j <= n; j += i) {
          isAnswers[j] = false;
        }
      }
    }

    return (int) IntStream.range(0, n + 1)
        .filter(i -> isAnswers[i] == true)
        .count();
  }
}
