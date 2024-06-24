package level0.problem181800;

/**
 * 부분 문자열인지 확인하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181843
 */
public class Problem181843 {

  public int solution(String my_string, String target) {
    return my_string.contains(target) ? 1 : 0;
  }
}
