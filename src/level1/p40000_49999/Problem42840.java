package level1.p40000_49999;

import java.util.ArrayList;
import java.util.List;

/**
 * 모의고사
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Problem42840 {

  public int[] solution(int[] answers) {

    int[] count = new int[3];
    int[] pattern1 = {1, 2, 3, 4, 5};
    int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == pattern1[i % pattern1.length]) {
        count[0]++;
      }
      if (answers[i] == pattern2[i % pattern2.length]) {
        count[1]++;
      }
      if (answers[i] == pattern3[i % pattern3.length]) {
        count[2]++;
      }
    }

    List<Integer> maxCounts = new ArrayList<>();
    maxCounts.add(1);

    int tempCount = count[0];
    for (int i = 1; i < count.length; i++) {
      if (count[i] > tempCount) {
        tempCount = count[i];
        maxCounts.clear();
        maxCounts.add(i + 1);
      } else if (count[i] == tempCount) {
        maxCounts.add(i + 1);
      }
    }

    return maxCounts.stream()
        .mapToInt(i -> i)
        .toArray();
  }
}
