package level0;

import java.time.LocalDate;

/**
 * 날짜 비교하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181838
 */
public class Problem181838 {

  public int solution(int[] date1, int[] date2) {
    LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
    LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);
    return localDate1.isAfter(localDate2) ? 0 : localDate1.equals(localDate2) ? 0 : 1;
  }
}
