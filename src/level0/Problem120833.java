package level0;

import java.util.stream.IntStream;

/**
 * 배열 자르기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class Problem120833 {

  public int[] solution(int[] numbers, int num1, int num2) {
    return IntStream.rangeClosed(num1, num2).map(m -> numbers[m]).toArray();
  }
}
