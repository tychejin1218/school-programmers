package level2.p40000_49999;

/**
 * 카펫
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */
public class Problem42842 {

  public int[] solution(int brown, int yellow) {

    int area = brown + yellow;

    for (int width = 3; width <= area / 3; width++) {
      for (int height = 3; height <= width; height++) {
        if (width * height == area && (width - 2) * (height - 2) == yellow) {
          return new int[]{width, height};
        }
      }
    }

    return new int[]{};
  }
}
