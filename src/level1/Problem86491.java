package level1;

/**
 * 최소직사각형
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */
public class Problem86491 {

  public int solution(int[][] sizes) {

    int maxWidth = 0;
    int maxHeight = 0;

    for (int[] size : sizes) {
      // 각 명함에서 가로와 세로 중 더 큰 값을 width, 더 작은 값을 height로 설정
      int width = Math.max(size[0], size[1]);
      int height = Math.min(size[0], size[1]);

      maxWidth = Math.max(maxWidth, width);
      maxHeight = Math.max(maxHeight, height);
    }

    return maxWidth * maxHeight;
  }
}
