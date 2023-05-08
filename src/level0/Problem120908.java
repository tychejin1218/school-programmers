package level0;

/**
 * 문자열안에 문자열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
public class Problem120908 {

  public int solution(String str1, String str2) {
    return str1.indexOf(str2) != -1 ? 1 : 2;
  }
}
