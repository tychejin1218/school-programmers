package level2.p12000_12999;

/**
 * 점프와 순간 이동
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 */
public class Problem12980 {

  /*public int solution(int n) {
    int ans = 0;

    String binaryString = Integer.toBinaryString(n);
    for (char bit : binaryString.toCharArray()) {
      if (bit == '1') {
        ans++;
      }
    }

    return ans;
  }*/

  public int solution(int n) {
    return Integer.bitCount(n);
  }
}
