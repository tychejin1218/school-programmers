package level1;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
public class Problem12935 {

  public int[] solution(int[] arr) {
    int min = Arrays.stream(arr).min().getAsInt();
    return arr.length == 1 ?
        new int[]{-1} :
        Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}
