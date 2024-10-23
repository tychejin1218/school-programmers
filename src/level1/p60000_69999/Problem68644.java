package level1.p60000_69999;

import java.util.Set;
import java.util.TreeSet;

/**
 * 두 개 뽑아서 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 */
public class Problem68644 {

  public int[] solution(int[] numbers) {

    Set<Integer> numberSet = new TreeSet<>();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        numberSet.add(numbers[i] + numbers[j]);
      }
    }

    return numberSet.stream()
        .mapToInt(i -> i)
        .toArray();
  }
}
