package level0.p120000_129999;

import java.util.Arrays;

/**
 * A로 B 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */
public class Problem120886 {

  public int solution(String before, String after) {

    String[] befores = before.split("");
    Arrays.sort(befores);

    String[] afters = after.split("");
    Arrays.sort(afters);

    return Arrays.equals(befores, afters) == true ? 1 : 0;
  }
}
