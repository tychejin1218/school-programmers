package level0.p120000_129999;

/**
 * 저주의 숫자 3
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */
public class Problem120871 {

  public int solution(int n) {
    int answer = 0;

    for (int a = 0; a < n; a++) {
      answer++;
      while (answer % 3 == 0 || String.valueOf(answer).indexOf("3") != -1) {
        answer++;
      }
    }
    return answer;
  }
}
