package level1.p12000_12999;

/**
 * 최대공약수와 최소공배수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */
public class Problem12940 {

  public int[] solution(int n, int m) {

    int gcdNum = 0;
    for (int i = 1; i <= Math.min(n, m); i++) {
      if (n % i == 0 && m % i == 0) {
        gcdNum = i;
      }
    }

    int lcmNum = Math.max(n, m);
    while (!((lcmNum % n == 0) && (lcmNum % m == 0))) {
      lcmNum++;
    }

    return new int[]{gcdNum, lcmNum};
  }
}
