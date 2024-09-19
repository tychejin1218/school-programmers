package level1;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 명예의 전당 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
public class Problem138477 {

  public int[] solution01(int k, int[] score) {

    int[] answer = new int[score.length];
    int[] topScores = new int[k];
    int scoreMinVal = Arrays.stream(score).min().orElse(0);

    for (int i = 0; i < score.length; i++) {
      if (i < k) {
        topScores[i] = score[i];
      } else {
        int topMinVal = topScores[0];
        int topMinIdx = 0;
        for (int j = 1; j < topScores.length; j++) {
          if (topScores[j] < topMinVal) {
            topMinVal = topScores[j];
            topMinIdx = j;
          }
        }
        if (score[i] > topMinVal) {
          topScores[topMinIdx] = score[i];
        }
      }

      answer[i] = Arrays.stream(topScores)
          .filter(topScore -> topScore >= scoreMinVal)
          .min()
          .orElse(0);
    }

    return answer;
  }

  public int[] solution(int k, int[] score) {

    int[] answer = new int[score.length];
    PriorityQueue<Integer> topScores = new PriorityQueue<>();

    for (int i = 0; i < score.length; i++) {
      if (i < k) {
        topScores.add(score[i]);
      } else {
        if (score[i] > topScores.peek()) {
          topScores.poll();
          topScores.add(score[i]);
        }
      }

      answer[i] = topScores.peek();
    }

    return answer;
  }
}
