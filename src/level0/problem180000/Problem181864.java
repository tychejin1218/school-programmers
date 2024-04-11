package level0.problem180000;

/**
 * 문자열 바꿔서 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181864
 */
public class Problem181864 {

  public int solution(String myString, String pat) {
    String replaceMyString = myString.replaceAll("A", "TEMP")
        .replaceAll("B", "A")
        .replaceAll("TEMP", "B");
    return replaceMyString.contains(pat) ? 1 : 0;
  }
}
