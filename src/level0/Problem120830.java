package level0;

/**
 * 양꼬치
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */
public class Problem120830 {

  public int solution(int n, int k) {
    int totalPrice = (n * 12000) + (k * 2000);
    int discountPrice = n / 10 * 2000;
    return totalPrice - discountPrice;
  }
}
