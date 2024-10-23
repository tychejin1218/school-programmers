package level0.p181800_181899;

import java.math.BigInteger;

/**
 * 두 수의 합
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 */
public class Problem181846 {

  public String solution(String a, String b) {
    return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
  }
}
