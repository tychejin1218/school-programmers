package level0.problem180000;

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
        String[] answer = new String[i];
        System.arraycopy(str_list, 0, answer, 0, i);
        return answer;
      } else if (str_list[i].equals("r")) {
        String[] answer = new String[str_list.length - i - 1];
        System.arraycopy(str_list, i + 1, answer, 0, str_list.length - i - 1);
        return answer;
      }
    }
    return new String[]{};
  }

}
