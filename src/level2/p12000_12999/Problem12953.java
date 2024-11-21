package level2.p12000_12999;

import java.util.Arrays;

/**
 * N개의 최소공배수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */
public class Problem12953 {

  public int solution(int[] arr) {
    int answer = 0;

    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      if (i == 0) {
        answer = arr[0];
      }
      answer = lcm(answer, arr[i + 1]);
    }

    return answer;
  }

  public int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }
}
