package level2.p12000_12999;

import java.util.Stack;

/**
 * 짝지어 제거하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12973
 */
public class Problem12973 {

  public int solution(String s) {

    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == ch) {
        stack.pop();
      } else {
        stack.push(ch);
      }
    }

    return stack.isEmpty() ? 1 : 0;
  }
}
