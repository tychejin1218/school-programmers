package level0;

/**
 * 배열의 유사도
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class Problem120903 {

  public int solution(String[] s1, String[] s2) {
    int answer = 0;

    for (String str1 : s1) {
      for (String str2 : s2) {
        if (str1.equals(str2)) {
          answer++;
        }
      }
    }
    return answer;
  }
}
