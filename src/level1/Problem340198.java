package level1;

import java.util.Arrays;

/**
 * [PCCE 기출문제] 10번 / 공원
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340198
 */
public class Problem340198 {

  public int solution(int[] mats, String[][] park) {

    Arrays.sort(mats);

    for (int k = mats.length - 1; k >= 0; k--) {
      int size = mats[k];
      for (int i = 0; i <= park.length - size; i++) {
        for (int j = 0; j <= park[0].length - size; j++) {
          boolean isPlace = true;

          for (int x = i; x < i + size; x++) {
            for (int y = j; y < j + size; y++) {
              if (!"-1".equals(park[x][y])) {
                isPlace = false;
                break;
              }
            }
            if (!isPlace) {
              break;
            }
          }

          if (isPlace) {
            return size;
          }
        }
      }
    }

    return -1;
  }
}
