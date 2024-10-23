package level0.p181900_181999;

/**
 * 수열과 구간 쿼리 4
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class Problem181942 {

  public int[] solution(int[] arr, int[][] queries) {

    for (int i = 0; i < queries.length; i++) {

      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];

      for (int j = s; j <= e; j++) {
        if (j % k == 0) {
          arr[j]++;
        }
      }
    }

    return arr;
  }

  public int[] solution01(int[] arr, int[][] queries) {

    for (int[] query : queries) {

      int s = query[0];
      int e = query[1];
      int k = query[2];

      for (int j = s; j <= e; j++) {
        if (j % k == 0) {
          arr[j]++;
        }
      }
    }

    return arr;
  }
}
