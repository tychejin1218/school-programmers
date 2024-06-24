package level0.problem181800;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * 배열의 원소만큼 추가하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */
public class Problem181861 {

  public int[] solution01(int[] arr) {

    Stack<Integer> stack = new Stack<>();
    int arrLen = arr.length;
    for (int i = 0; i < arrLen; i++) {
      int currentElement = arr[i];
      for (int j = 0; j < currentElement; j++) {
        stack.push(currentElement);
      }
    }

    return stack.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public int[] solution(int[] arr) {
    return Arrays.stream(arr)
        .flatMap(i -> IntStream.range(0, i)
            .map(j -> i))
        .toArray();
  }
}
