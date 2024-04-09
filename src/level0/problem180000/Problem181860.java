package level0.problem180000;

import java.util.Stack;

/**
 * 빈 배열에 추가, 삭제하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181860
 */
public class Problem181860 {

  public int[] solution(int[] arr, boolean[] flag) {

    Stack<Integer> stack = new Stack<>();

    int arrLen = arr.length;
    for (int i = 0; i < arrLen; i++) {
      int currentElement = arr[i];
      boolean isCurrentFlag = flag[i];
      if (isCurrentFlag) {
        for (int j = 0; j < currentElement * 2; j++) {
          stack.push(currentElement);
        }
      } else {
        for (int j = 0; j < currentElement; j++) {
          stack.pop();
        }
      }
    }

    return stack.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
