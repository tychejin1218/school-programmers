package level0;

/**
 * 이진수 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */
public class Problem120885 {

  public String solution(String bin1, String bin2) {
    int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
    return Integer.toBinaryString(sum);
  }
}
