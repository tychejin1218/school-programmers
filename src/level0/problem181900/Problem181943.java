package level0.problem181900;

/**
 * 문자열 섞기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class Problem181943 {

  public String solution(String my_string, String overwrite_string, int s) {
    String prefix = my_string.substring(0, s);
    String suffix = my_string.substring(s + overwrite_string.length());
    return prefix + overwrite_string + suffix;
  }
}
