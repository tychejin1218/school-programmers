package level0.p181900_181999;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 콜라츠 수열 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */
public class Problem181919 {

  public int[] solution01(int n) {

    List<Integer> answerList = new ArrayList<>();
    answerList.add(n);

    while (n != 1) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = 3 * n + 1;
      }
      answerList.add(n);
    }

    return answerList.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public int[] solution(int n) {
    return Stream.iterate(n,
            i -> i >= 1,
            i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : 3 * i + 1)
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
