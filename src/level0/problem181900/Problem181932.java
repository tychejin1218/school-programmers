package level0.problem181900;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩 기초 트레이닝
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */
public class Problem181932 {

  public String solution(String code) {

    int mode = 0;
    List<String> answerList = new ArrayList<>();

    for (int i = 0; i < code.length(); i++) {
      char charCode = code.charAt(i);
      if (charCode == '1') {
        mode = mode == 1 ? 0 : 1;
      } else {
        if (mode == 1 && i % 2 != 0) {
          answerList.add(String.valueOf(charCode));
        } else if (mode == 0 && i % 2 == 0) {
          answerList.add(String.valueOf(charCode));
        }
      }
    }

    return answerList.isEmpty() ? "EMPTY" : String.join("", answerList);
  }
}
