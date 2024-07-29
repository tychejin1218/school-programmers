package level1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * 2016년
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Problem12901 {

  public String solution(int a, int b) {
    return LocalDate.of(2016, a, b)
        .getDayOfWeek()
        .getDisplayName(TextStyle.SHORT, Locale.ENGLISH)
        .toUpperCase();
  }
}
