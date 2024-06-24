package level0.problem181800;

/**
 * 특정한 문자를 대문자로 바꾸기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181873
 */
public class Problem181873 {

  public String solution(String my_string, String alp) {
    return my_string.replaceAll(alp, alp.toUpperCase());
  }
}
