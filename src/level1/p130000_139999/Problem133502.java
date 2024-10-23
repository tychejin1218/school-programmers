package level1.p130000_139999;

import java.util.Stack;

/**
 * 햄버거 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */
public class Problem133502 {

  public int solution(int[] ingredient) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();

    for (int i : ingredient) {
      stack.push(i);
      if (stack.size() >= 4) {
        if (stack.get(stack.size() - 4) == 1 &&
            stack.get(stack.size() - 3) == 2 &&
            stack.get(stack.size() - 2) == 3 &&
            stack.get(stack.size() - 1) == 1) {
          stack.pop();
          stack.pop();
          stack.pop();
          stack.pop();
          answer++;
        }
      }
    }

    return answer;
  }
}
