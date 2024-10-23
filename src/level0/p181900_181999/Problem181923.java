package level0.p181900_181999;

import java.util.Arrays;

/**
 * 수열과 구간 쿼리 4
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */
public class Problem181923 {

//  public int[] solution01(int[] arr, int[][] queries) {
//
//    int[] answer = new int[queries.length];
//
//    List<Integer> answerList = new ArrayList<>();
//    for (int i = 0; i < queries.length; i++) {
//      int s = queries[i][0];
//      int e = queries[i][1];
//      int k = queries[i][2];
//      for (int j = s; j <= e; j++) {
//        if (arr[j] > k) {
//          answerList.add(arr[j]);
//        }
//      }
//      answer[i] = answerList.stream()
//          .sorted()
//          .collect(Collectors.toList())
//          .stream()
//          .findFirst()
//          .orElse(-1);
//      answerList = new ArrayList<>();
//    }
//
//    return answer;
//  }

  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];

      answer[i] = Arrays.stream(arr, s, e + 1)
          .filter(value -> value > k)
          .min()
          .orElse(-1);
    }

    return answer;
  }
}
