package level1;

import java.util.stream.IntStream;

/**
 * 부족한 금액 계산하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
public class Problem82612 {

  public long solution(int price, int money, int count) {
    long totalMoney = IntStream.rangeClosed(1, count)
        .mapToLong(i -> (long) price * i)
        .sum();
    return totalMoney > money ? totalMoney - money : 0;
  }
}
