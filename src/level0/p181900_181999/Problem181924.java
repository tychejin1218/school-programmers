package level0.p181900_181999;

/**
 * 수열과 구간 쿼리 3
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */
public class Problem181924 {

  public int[] solution(int[] arr, int[][] queries) {

    for (int[] query : queries) {
      int temp = arr[query[0]];
      arr[query[0]] = arr[query[1]];
      arr[query[1]] = temp;
    }

    return arr;
  }
}
