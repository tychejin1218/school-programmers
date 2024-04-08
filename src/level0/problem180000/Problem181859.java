package level0.problem180000;

import java.util.ArrayList;
import java.util.List;

/**
 * 배열 만들기 6
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181859
 */
public class Problem181859 {

  public int[] solution(int[] arr) {

    List<Integer> list = new ArrayList<>();
    for (int value : arr) {
      int listSize = list.size();
      if (listSize == 0) {
        list.add(value);
      } else {
        int finalValue = list.get(listSize - 1);
        if (finalValue == value) {
          list.remove(listSize - 1);
        } else {
          list.add(value);
        }
      }
    }

    int[] answer = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    return answer.length != 0 ? answer : new int[]{-1};
  }
}
