package level0.problem180000;

import java.util.Stack;

/**
 * 배열의 원소만큼 추가하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */
public class Problem181861 {

  public int[] solution(int[] arr) {

    Stack<Integer> stack = new Stack<>();
    int arrLen = arr.length;
    for (int i = 0; i < arr.length; i++) {
      int currentElement = arr[i];
      for (int j = 0; j < currentElement; j++) {
        stack.push(currentElement);
      }
    }

    return stack.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
