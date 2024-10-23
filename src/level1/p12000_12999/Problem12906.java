package level1.p12000_12999;

import java.util.ArrayList;
import java.util.List;

/**
 * 같은 숫자는 싫어
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Problem12906 {

  public int[] solution(int[] arr) {

    List<Integer> numList = new ArrayList<>();
    numList.add(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] != arr[i]) {
        numList.add(arr[i]);
      }
    }

    return numList.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
