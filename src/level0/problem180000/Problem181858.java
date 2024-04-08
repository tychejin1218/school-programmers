package level0.problem180000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 무작위로 K개의 수 뽑기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181858
 */
public class Problem181858 {

  public int[] solution01(int[] arr, int k) {

    int[] answer = new int[k];

    int[] distinctAnswer = Arrays.stream(arr)
        .distinct()
        .boxed()
        .mapToInt(Integer::intValue)
        .toArray();

    int distinctAnswerLen = distinctAnswer.length;
    if (distinctAnswerLen > k) {
      answer = Arrays.copyOf(distinctAnswer, k);
    } else {
      for (int i = 0; i < k; i++) {
        if (distinctAnswerLen > i) {
          answer[i] = distinctAnswer[i];
        } else {
          answer[i] = -1;
        }
      }
    }

    return answer;
  }

  public int[] solution(int[] arr, int k) {

    LinkedHashSet<Integer> arrSet = new LinkedHashSet<>();
    for (int i : arr) {
      arrSet.add(i);
    }

    List<Integer> arrList = new ArrayList<>(arrSet);
    while (arrList.size() < k) {
      arrList.add(-1);
    }

    return arrList.stream()
        .limit(k)
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
