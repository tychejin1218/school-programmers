package level1.p12000_12999;

/**
 * 문자열 다루기 기본
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */
public class Problem12918 {

  public boolean solution(String s) {
    return (s.length() == 4 || s.length() == 6) ? (s.matches("\\d+") ? true : false) : false;
  }
}
