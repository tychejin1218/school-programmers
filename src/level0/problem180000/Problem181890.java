package level0.problem180000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 왼쪽 오른쪽
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181890
 */
public class Problem181890 {

  public String[] solution(String[] str_list) {
    for (int i = 0; i < str_list.length; i++) {
      if (str_list[i].equals("l")) {
        return Arrays.copyOfRange(str_list, 0, i);
      } else if (str_list[i].equals("r")) {
        return Arrays.copyOfRange(str_list, i, str_list.length);
      }
    }
    return new String[]{};
  }
}
