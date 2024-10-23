package level1.p40000_49999;

import java.util.HashSet;
import java.util.Set;

/**
 * 체육복
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
public class Problem42862 {

  public int solution(int n, int[] lost, int[] reserve) {

    Set<Integer> lostSet = new HashSet<>();
    Set<Integer> reserveSet = new HashSet<>();

    for (int r : reserve) {
      reserveSet.add(r);
    }
    for (int l : lost) {
      if (reserveSet.contains(l)) {
        reserveSet.remove(l);
      } else {
        lostSet.add(l);
      }
    }

    for (int r : reserveSet) {
      if (lostSet.contains(r - 1)) {
        lostSet.remove(r - 1);
      } else if (lostSet.contains(r + 1)) {
        lostSet.remove(r + 1);
      }
    }

    return n - lostSet.size();
  }
}
