package level0.problem120000;

/**
 * 문자열 계산하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120902
 */
public class Problem120902 {

  public int solution(String my_string) {

    String[] myStr = my_string.split(" ");

    int answer = Integer.parseInt(myStr[0]);
    for (int a = 1; a < myStr.length - 1; a++) {
      if ("+".equals(myStr[a])) {
        answer += Integer.parseInt(myStr[a + 1]);
      } else if ("-".equals(myStr[a])) {
        answer -= Integer.parseInt(myStr[a + 1]);
      }
    }

    return answer;
  }
}
