package level0.p120000_129999;

/**
 * 겹치는 선분의 길이
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120876
 */
public class Problem120876 {

  public int solution(int[][] lines) {

    int answer = 0;

    int[] arr = new int[200];

    for (int a = 0; a < lines.length; a++) {
      for (int b = lines[a][0] + 100; b < lines[a][1] + 100; b++) {
        arr[b]++;
      }
    }

    for (int a = 0; a < 200; a++) {
      if (arr[a] > 1) {
        answer++;
      }
    }

    return answer;
  }
}
