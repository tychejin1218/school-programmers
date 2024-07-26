package level0.problem250000;

/**
 * [PCCE 기출문제] 5번 / 산책
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/250129
 */
public class Problem250128 {

  public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
    int num_student = numbers.length;
    String[] answer = new String[num_student];
    for (int i = 0; i < num_student; i++) {
      if (our_score[i] == score_list[numbers[i] -1]) {
        answer[i] = "Same";
      } else {
        answer[i] = "Different";
      }
    }
    return answer;
  }
}
