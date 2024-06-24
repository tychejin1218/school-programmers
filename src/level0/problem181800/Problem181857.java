package level0.problem181800;

import java.util.Arrays;

/**
 * 배열의 길이를 2의 거듭제곱으로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181857
 */
public class Problem181857 {

  public int[] solution(int[] arr) {
    int arrLen = arr.length;
    int powerLen = 1;
    while (powerLen < arrLen) {
      powerLen *= 2;
    }
    return Arrays.copyOf(arr, powerLen);
  }
}
