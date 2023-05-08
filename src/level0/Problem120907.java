package level0;

import java.util.ArrayList;
import java.util.List;

/**
 * OX퀴즈
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */
public class Problem120907 {

  public String[] solution(String[] quiz) {

    List<String> answerList = new ArrayList<>();
    for (String quizStr : quiz) {
      String[] quizArr = quizStr.split(" ");

      int expected;
      if ("+".equals(quizArr[1])) {
        expected = Integer.parseInt(quizArr[0]) + Integer.parseInt(quizArr[2]);
      } else {
        expected = Integer.parseInt(quizArr[0]) - Integer.parseInt(quizArr[2]);
      }

      if (expected == Integer.parseInt(quizArr[4])) {
        answerList.add("O");
      } else {
        answerList.add("X");
      }
    }

    return answerList.toArray(new String[answerList.size()]);
  }
}
