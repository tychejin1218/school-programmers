package level0.p120000_129999;

/**
 * 옷가게 할인 받기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */
public class Problem120818 {

  public int solution(int price) {

    int answer = 0;
    int discount = 0;
    double payable = 0;

    if (price >= 500000) {
      discount = 20;
    } else if (price >= 300000) {
      discount = 10;
    } else if (price >= 100000) {
      discount = 5;
    }

    payable = (price - (price * discount / 100.0));

    answer = (int) payable;

    return answer;
  }

  public int solution1(int price) {

    int answer = 0;

    if (price >= 500000) {
      answer = (int) (price * 0.8);
    } else if (price >= 300000) {
      answer = (int) (price * 0.9);
    } else if (price >= 100000) {
      answer = (int) (price * 0.95);
    } else {
      answer = price;
    }

    return answer;
  }
}
