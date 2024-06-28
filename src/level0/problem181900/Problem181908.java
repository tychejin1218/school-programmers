package level0.problem181900;

/**
 * 접미사인지 확인하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181908
 */
public class Problem181908 {

  public int solution(String my_string, String is_suffix) {
    return my_string.endsWith(is_suffix) ? 1 : 0;
  }
}
