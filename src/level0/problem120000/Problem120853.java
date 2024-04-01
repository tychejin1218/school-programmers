package level0.problem120000;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 컨트롤 제트
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */
public class Problem120853 {

  public int solution(String s) {

    int answer = 0;

    String[] strs = s.split(" ");
    for (int a = 0; a < strs.length; a++) {
      if ("Z".equals(strs[a])) {
        strs[a] = "0";
        strs[a - 1] = "0";
      }
    }

    for (int a = 0; a < strs.length; a++) {
      answer += Integer.valueOf(strs[a]);
    }

    return answer;
  }

  /*public int solution(String s) {
    String[] strs = s.split(" ");
    return IntStream.range(0, strs.length)
        .map(m -> (m != strs.length - 1 && !strs[m].equals("Z"))
            ? (strs[m + 1].equals("Z") ? 0 : Integer.valueOf(strs[m]))
            : (strs[m].equals("Z") ? 0 : Integer.valueOf(strs[m])))
        .sum();
  }*/
}
