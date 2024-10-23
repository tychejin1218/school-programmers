package level0.p120000_129999;

/**
 * 치킨 쿠폰
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 */
public class Problem120884 {

  public int solution(int chicken) {
    int answer = 0;

    int serviceChicken = chicken / 10;
    int coupon = serviceChicken + (chicken % 10);

    while (true) {

      answer += serviceChicken;

      if (coupon < 10) {
        break;
      }

      serviceChicken = coupon / 10;
      coupon = serviceChicken + (coupon % 10);

    }

    return answer;
  }
}
