package level0.problem180000;

/**
 * 수열과 구간 쿼리 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */
public class Problem181883 {

  public int[] solution(int[] arr, int[][] queries) {
    for (int i = 0; i < queries.length; i++) {
      int s = queries[i][0];
      int e = queries[i][1];
      for (int j = 0; j < arr.length; j++) {
        if (j >= s && j <= e) {
          arr[j] = arr[j] + 1;
        }
      }
    }
    return arr;
  }
}
