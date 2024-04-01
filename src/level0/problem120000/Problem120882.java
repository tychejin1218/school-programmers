package level0.problem120000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 등수 매기기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120882
 */
public class Problem120882 {

  public int[] solution(int[][] score) {

    int[] answer = new int[score.length];
    Double[] average = new Double[score.length];

    for (int a = 0; a < score.length; a++) {
      int size = score[a].length;
      int sum = 0;
      for (int b = 0; b < size; b++) {
        sum += score[a][b];
      }
      answer[a] = 1;
      average[a] = (double) sum / (double) size;
    }

    for (int a = 0; a < average.length; a++) {
      for (int b = 0; b < average.length; b++) {
        if (average[a] < average[b]) {
          answer[a]++;
        }
      }
    }

    return answer;
  }

  public int[] solution01(int[][] score) {

    List<Integer> scoreList = new ArrayList<>();
    for (int[] a : score) {
      scoreList.add(a[0] + a[1]);
    }
    scoreList.sort(Comparator.reverseOrder());

    int[] answer = new int[score.length];
    for (int i = 0; i < score.length; i++) {
      answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
    }
    return answer;
  }

  public int[] solution02(int[][] score) {
    return Arrays.stream(score)
        .map(arrScore -> Arrays.stream(arrScore).average().orElse(0))
        .mapToInt(averageScore ->
            Arrays.stream(score)
                .map(arrScore -> Arrays.stream(arrScore).average().orElse(0))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).indexOf(averageScore) + 1)
        .toArray();
  }
}
