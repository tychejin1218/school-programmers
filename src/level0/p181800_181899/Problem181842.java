package level0.p181800_181899;

/**
 * 부분 문자열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181842
 */
public class Problem181842 {

  public int solution(String str1, String str2) {
    return str2.contains(str1) ? 1 : 0;
  }
}
