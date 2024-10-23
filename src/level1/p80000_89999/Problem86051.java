package level1.p80000_89999;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 없는 숫자 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class Problem86051 {

  public int solution(int[] numbers) {
    return IntStream.range(0, 10).sum() - Arrays.stream(numbers).sum();
  }
}
