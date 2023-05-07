package level0;

/**
 * 숫자 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120904
 */
public class Problem120904 {

  public int solution(int num, int k) {
    int answer = String.valueOf(num).indexOf(String.valueOf(k));
    return answer == -1 ? answer : answer + 1;
  }
}
