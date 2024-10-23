package level0.p181800_181899;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 배열 만들기 6
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181859
 */
public class Problem181859 {

  public int[] solution01(int[] arr) {

    List<Integer> list = new ArrayList<>();
    for (int value : arr) {
      int listSize = list.size();
      if (listSize == 0) {
        list.add(value);
      } else {
        int finalValue = list.get(listSize - 1);
        if (finalValue == value) {
          list.remove(listSize - 1);
        } else {
          list.add(value);
        }
      }
    }

    int[] answer = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return answer.length != 0 ? answer : new int[]{-1};
  }

  public int[] solution(int[] arr) {

    Stack<Integer> stack = new Stack<>();
    for (int i : arr) {
      if (stack.isEmpty()) {
        stack.push(i);
      } else {
        if (stack.peek() == i) {
          stack.pop();
        } else {
          stack.push(i);
        }
      }
    }

    int[] answer = stack.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return stack.isEmpty() ? new int[]{-1} : answer;
  }
}
