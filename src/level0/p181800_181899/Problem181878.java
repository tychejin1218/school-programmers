package level0.p181800_181899;

/**
 * 원하는 문자열 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */
public class Problem181878 {

  public int solution(String myString, String pat) {
    return myString.toLowerCase().indexOf(pat.toLowerCase()) != -1 ? 1 : 0;
  }
}
