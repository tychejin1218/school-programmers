package level0;

/**
 * 두 수의 나눗셈
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
public class Problem120806 {

  public int solution(int num1, int num2) {
    double result = (double) num1 / (double) num2;
    return (int) (result * 1000);
  }
}
