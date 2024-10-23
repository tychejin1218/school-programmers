package level1.p12000_12999;

/**
 * 이상한 문자 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
public class Problem12930 {

  public String solution(String s) {

    StringBuilder result = new StringBuilder();
    int cnt = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (ch == ' ') {
        cnt = 0;
      } else {
        cnt++;
        if (cnt % 2 == 0) {
          ch = Character.toLowerCase(ch);
        } else {
          ch = Character.toUpperCase(ch);
        }
      }

      result.append(ch);
    }

    return result.toString();
  }
}
