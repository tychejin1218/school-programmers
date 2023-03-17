package level0;

/**
 * 피자 나눠 먹기 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */
public class Problem120814 {

  /*public int solution(int n) {
    int answer;
    int quotient = n / 7;
    int remainder = n % 7;

    if (quotient == 1) {
      answer = 1;
    } else if (quotient == 0 && remainder != 0) {
      answer = 1;
    } else if (quotient > 1 && remainder != 0) {
      answer = quotient + 1;
    } else {
      answer = quotient;
    }

    return answer;
  }*/

  /*public int solution(int n) {
    return n % 7 == 0 ? n / 7 : n / 7 + 1;
  }*/

  public int solution(int n) {
    return (n + 6) / 7;
  }
}
