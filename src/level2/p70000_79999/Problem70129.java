package level2.p70000_79999;

/**
 * 이진 변환 반복하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
public class Problem70129 {

  public int[] solution(String s) {

    int totalZeroCount = 0;
    int transformationCount = 0;
    while (!"1".equals(s)) {
      int currentZeroCount = 0;
      int oneCount = 0;
      for (char sChar : s.toCharArray()) {
        if (sChar == '0') {
          currentZeroCount++;
        }
        if (sChar == '1') {
          oneCount++;
        }
      }
      totalZeroCount += currentZeroCount;
      s = Integer.toBinaryString(oneCount);
      transformationCount++;
    }

    return new int[]{transformationCount, totalZeroCount};
  }
}
