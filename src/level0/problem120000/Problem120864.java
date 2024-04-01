package level0.problem120000;

import java.util.Arrays;

/**
 * 숨어있는 숫자의 덧셈 (2)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120864
 */
public class Problem120864 {

  public int solution1(String my_string) {
    int answer = 0;
    String[] myArr = my_string.split("[a-zA-z]+");
    for (String myStr : myArr) {
      if (myStr.matches("[0-9]+")) {
        answer += Integer.parseInt(myStr);
      }
    }
    return answer;
  }

  public int solution(String my_string) {
    return Arrays.stream(my_string.split("[a-zA-z]+"))
        .filter(p -> p.matches("[0-9]+"))
        .mapToInt(Integer::valueOf)
        .sum();
  }
}
