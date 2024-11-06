package level02.p12000_12999;

import java.util.Stack;

/**
 * 올바른 괄호
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class Problem12909 {

  public boolean solution(String s) {

    if (s.startsWith(")")) {
      return false;
    }

    int count = 0;
    for (char sChar : s.toCharArray()) {
      if (sChar == '(') {
        count++;
      } else if (sChar == ')') {
        count--;
      }

      if (count < 0) {
        return false;
      }
    }

    return count == 0;
  }

  public boolean solution01(String s) {

    Stack<Character> stack = new Stack<>();
    for (char sChar : s.toCharArray()) {
      if (sChar == '(') {
        stack.push(sChar);
      } else if (sChar == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
    }

    return stack.isEmpty();
  }
}
