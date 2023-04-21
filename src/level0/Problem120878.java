package level0;

/**
 * 유한소수 판별하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120878
 */
public class Problem120878 {

  public int solution(int a, int b) {
    int answer = 1;

    // 최대공약수
    int gcd = 0;
    for (int i = 1; i <= a && i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }

    // 기약 분수
    int[] answers = {a / gcd, b / gcd};

    // 분모
    int denom = answers[1];

    // 유한 소수
    while (denom != 1) {
      if (denom % 2 == 0) {
        denom /= 2;
      } else if (denom % 5 == 0) {
        denom /= 5;
      } else {
        return 2;
      }
    }

    return answer;
  }
}
