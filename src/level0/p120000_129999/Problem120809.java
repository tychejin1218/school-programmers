package level0.p120000_129999;

import java.util.Arrays;

/**
 * 배열 두배 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */
public class Problem120809 {

  public int[] solution(int[] numbers) {
    return Arrays.stream(numbers)
        .map(p -> p * 2)
        .toArray();
  }
}
