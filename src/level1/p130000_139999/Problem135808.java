package level1.p130000_139999;

import java.util.Arrays;

/**
 * 과일 장수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
public class Problem135808 {

  public int solution(int k, int m, int[] score) {
    int answer = 0;

    Arrays.sort(score);
    for (int i = score.length - 1; i >= m - 1; i -= m) {
      int minScore = score[i - (m - 1)];
      if (minScore <= k) {
        answer += minScore * m;
      }
    }

    return answer;
  }
}
