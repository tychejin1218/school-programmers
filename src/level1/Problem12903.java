package level1;

/**
 * 가운데 글자 가져오기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class Problem12903 {

  public String solution(String s) {
    int sLen = s.length();
    int midIdx = sLen / 2;
    return sLen % 2 == 0 ? s.substring(midIdx - 1, midIdx + 1)
        : String.valueOf(s.charAt(midIdx));
  }
}
