package level0;

/**
 * 특별한 이차원 배열 2
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181831
 */
public class Problem181831 {

  public int solution(int[][] arr) {
    int answer = 1;

    int n = arr.length;
    for (int a = 0; a < n; a++) {
      for (int b = 0; b < n; b++) {
        if(arr[a][b] != arr[b][a]){
          answer = 0;
          break;
        }
      }
    }

    return answer;
  }
}
