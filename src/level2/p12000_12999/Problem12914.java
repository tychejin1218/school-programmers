package level2.p12000_12999;

/**
 * 멀리 뛰기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 */
public class Problem12914 {

  public long solution(int n) {

    long[] stepWayArr = new long[n + 1];

    stepWayArr[1] = 1;
    if (n >= 2) {
      stepWayArr[2] = 2;
    }

    for (int i = 3; i <= n; i++) {
      stepWayArr[i] = (stepWayArr[i - 1] + stepWayArr[i - 2]) % 1234567;
    }

    return stepWayArr[n];
  }
}
