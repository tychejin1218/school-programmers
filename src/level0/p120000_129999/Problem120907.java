package level0.p120000_129999;

import java.util.Arrays;

/**
 * OX퀴즈
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */
public class Problem120907 {

  /*public String[] solution01(String[] quiz) {

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
  }*/

  public String[] solution(String[] quiz) {
    return Arrays.stream(quiz)
        .map(m -> {
          String[] quizArr = m.split(" ");
          int expected;
          if ("+".equals(quizArr[1])) {
            expected = Integer.parseInt(quizArr[0]) + Integer.parseInt(quizArr[2]);
          } else {
            expected = Integer.parseInt(quizArr[0]) - Integer.parseInt(quizArr[2]);
          }
          return expected == Integer.parseInt(quizArr[4]) ? "O" : "X";
        }).toArray(String[]::new);
  }
}
