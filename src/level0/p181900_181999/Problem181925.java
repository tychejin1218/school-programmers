package level0.p181900_181999;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 수 조작하기 2
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */
public class Problem181925 {

  public String solution(int[] numLog) {

    List<String> controlList = new ArrayList<>();

    for (int i = 1; i < numLog.length; i++) {
      boolean isIncrement = numLog[i] > numLog[i - 1];

      int numDifference = Math.abs(numLog[i] - numLog[i - 1]);
      if (numDifference == 1) {
        controlList.add(isIncrement ? "w" : "s");
      } else if (numDifference == 10) {
        controlList.add(isIncrement ? "d" : "a");
      }
    }

    return controlList.stream().collect(Collectors.joining());
  }
}
