package level0.problem181900;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 등차수열의 특정한 항만 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181931
 */
public class Problem181931 {

  public int solution01(int a, int d, boolean[] included) {

    int arithmeticNum = a;
    List<Integer> arithmeticList = new ArrayList<>();
    for (int i = 0; i < included.length; i++) {
      if (included[i]) {
        arithmeticList.add(arithmeticNum);
      }
      arithmeticNum = arithmeticNum + d;
    }

    return arithmeticList.stream()
        .mapToInt(Integer::intValue)
        .sum();
  }

  public int solution(int a, int d, boolean[] included) {
    return IntStream.range(0, included.length)
        .filter(i -> included[i])
        .map(i -> a + i * d)
        .sum();
  }


}
