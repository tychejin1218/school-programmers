package level0.problem180000;

import java.util.Arrays;

/**
 * x 사이의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */
public class Problem181867 {

  public int[] solution01(String myString) {
    return Arrays.stream(myString.split("x", -1))
        .map(p -> p.length())
        .mapToInt(p -> p)
        .toArray();
  }

  public int[] solution(String myString) {

    String[] result01 = "abc:def:ghi:jkl".split(":", 2);
    System.out.println(Arrays.toString(result01));

    String[] result02 = "abc::def:::".split(":", 0);
    System.out.println(Arrays.toString(result02));

    String[] result03 = "abc::def:::".split(":", -1);
    System.out.println(Arrays.toString(result03));

    return Arrays.stream(myString.split("x", -1))
        .map(p -> p.length())
        .mapToInt(p -> p)
        .toArray();
  }
}
