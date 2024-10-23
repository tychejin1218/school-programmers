package level0.p181800_181899;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 길이에 따른 연산
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */
public class Problem181879 {

  public int solution(int[] num_list) {
    return num_list.length > 10 ?
        Arrays.stream(num_list).sum() :
        Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
  }

  public int solution01(int[] num_list) {
    IntStream numListSteram = IntStream.of(num_list);
    return num_list.length > 10 ? numListSteram.sum() : numListSteram.reduce(1, (a, b) -> a * b);
  }
}
