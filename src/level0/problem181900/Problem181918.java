package level0.problem181900;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열 만들기 4
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181918
 */
public class Problem181918 {

  public int[] solution(int[] arr) {

    int i = 0;

    List<Integer> stkList = new ArrayList<>();
    while (i < arr.length) {
      int arrValue = arr[i];
      int stkSize = stkList.size();
      if (stkList.isEmpty()) {
        stkList.add(arrValue);
        i++;
      } else {
        int stkValue = stkList.get(stkSize - 1);
        if (stkValue < arrValue) {
          stkList.add(arrValue);
          i++;
        } else {
          stkList.remove(stkSize - 1);
        }
      }
    }

    return stkList.stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
