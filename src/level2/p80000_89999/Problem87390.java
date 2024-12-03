package level2.p80000_89999;

/**
 * n^2 배열 자르기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/87390
 */
public class Problem87390 {

  public int[] solution(int n, long left, long right) {

    int size = (int) (right - left + 1);
    int[] result = new int[size];

    for (int idx = 0; idx < size; idx++) {
      long index = left + idx;
      int i = (int) (index / n);
      int j = (int) (index % n);
      result[idx] = Math.max(i + 1, j + 1);
    }

    return result;
  }
}
