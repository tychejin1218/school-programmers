package level0.p181900_181999;

/**
 * 접두사인지 확인하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181906
 */
public class Problem181906 {

  public int solution(String my_string, String is_prefix) {
    return my_string.startsWith(is_prefix) ? 1 : 0;
  }
}
