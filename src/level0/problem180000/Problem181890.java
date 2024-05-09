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
    String[] answer = {};

    int indexL = 0;
    int indexR = 0;

    for (int i = 0; i < str_list.length; i++) {
      String str = str_list[i];
      if ("l".equals(str)) {
        indexL = i;
        break;
      } else if ("r".equals(str)) {
        indexR = i;
        break;
      }
    }

    if (indexL != 0) {
      answer = IntStream.range(0, indexL)
          .mapToObj(i -> str_list[i])
          .toArray(String[]::new);
    } else if (indexR != 0) {
      answer = IntStream.range(indexR, str_list.length)
          .mapToObj(i -> str_list[i])
          .toArray(String[]::new);
    }

    return answer;
  }
}
