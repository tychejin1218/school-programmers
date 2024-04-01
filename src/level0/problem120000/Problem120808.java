package level0.problem120000;

import java.util.Arrays;

/**
 * 분수의 덧셈
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 */
public class Problem120808 {

  public int[] solution(int numer1, int denom1, int numer2, int denom2) {

    // 두 분수를 더한 값
    int addNumer = numer1 * denom2 + numer2 * denom1;
    int addDenom = denom1 * denom2;
    System.out.println("addNumer : " + addNumer);
    System.out.println("addDenom : " + addDenom);

    // 최대공약수
    int gcd = 0;
    for (int a = 1; a <= addNumer && a <= addDenom; a++) {
      if (addNumer % a == 0 && addDenom % a == 0) {
        gcd = a;
      }
    }
    System.out.println("gcd : " + gcd);

    // 기약 분수
    int[] answer = {addNumer / gcd, addDenom / gcd};
    System.out.println("answer : " + Arrays.toString(answer));

    return answer;
  }
}
