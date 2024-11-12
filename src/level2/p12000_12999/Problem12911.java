package level2.p12000_12999;

/**
 * 다음 큰 숫자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12911
 */
public class Problem12911 {

  public int solution(int n) {

    int originalOneCount = getOneCount(n);
    int nextNumber = n + 1;

    while (getOneCount(nextNumber) != originalOneCount) {
      nextNumber++;
    }

    return nextNumber;
  }

  public int getOneCount(int n) {

    int oneCount = 0;
    String binaryStr = Integer.toBinaryString(n);
    for (char binaryChar : binaryStr.toCharArray()) {
      if (binaryChar == '1') {
        oneCount++;
      }
    }

    return oneCount;
  }
}
