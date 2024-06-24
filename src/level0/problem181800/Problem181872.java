package level0.problem181800;

/**
 * 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */
public class Problem181872 {

  public String solution(String myString, String pat) {
    return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
  }
}
