package level1.p70000_79999;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
public class Problem77484 {

  public int[] solution(int[] lottos, int[] win_nums) {

    int matchNumber = 0;
    for (int lotto : lottos) {
      for (int win_num : win_nums) {
        if (lotto == win_num) {
          matchNumber++;
          break;
        }
      }
    }

    int zeroCount = (int) Arrays.stream(lottos)
        .filter(lottoNumber -> lottoNumber == 0)
        .count();

    int bestMatchNumber = matchNumber + zeroCount;
    int worstMatchNumber = matchNumber;

    int bestRank = (bestMatchNumber >= 2 && bestMatchNumber <= 6) ? 7 - bestMatchNumber : 6 ;
    int worstRank = (worstMatchNumber >= 2 && worstMatchNumber <= 6) ? 7 - worstMatchNumber : 6 ;

    return new int[]{bestRank, worstRank};
  }
}
