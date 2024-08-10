package level1;

import java.util.Arrays;

/**
 * 평균 구하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
public class Problem12944 {

  public double solution(int[] arr) {
    return Arrays.stream(arr).average().getAsDouble();
  }
}
