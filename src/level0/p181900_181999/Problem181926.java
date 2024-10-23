package level0.p181900_181999;

import java.util.Arrays;

/**
 * 수 조작하기 1
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */
public class Problem181926 {

  public int solution(int n, String control) {

    String[] controls = control.split("");
    for (String controlChar : controls) {
      switch (controlChar) {
        case "w":
          n++;
          break;
        case "s":
          n--;
          break;
        case "d":
          n += 10;
          break;
        case "a":
          n -= 10;
          break;
      }
    }

    return n;
  }

  public int solution01(int n, String control) {

    int[] nums = new int[1];
    nums[0] = n;
    Arrays.stream(control.split(""))
        .forEach(controlChar -> {
          switch (controlChar) {
            case "w":
              nums[0]++;
              break;
            case "s":
              nums[0]--;
              break;
            case "d":
              nums[0] += 10;
              break;
            case "a":
              nums[0] -= 10;
              break;
          }
        });

    return nums[0];
  }
}
