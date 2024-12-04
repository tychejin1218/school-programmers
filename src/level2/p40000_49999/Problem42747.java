package level2.p40000_49999;

import java.util.Arrays;

/**
 * H-Index
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747
 */
public class Problem42747 {

  public int solution(int[] citations) {

    Arrays.sort(citations);

    int citationLen = citations.length;
    for (int i = 0; i < citationLen; i++) {
      int h = citationLen - i;
      if (citations[i] >= h) {
        return h;
      }
    }

    return 0;
  }
}
