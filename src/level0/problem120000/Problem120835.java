package level0.problem120000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 진료 순서 정하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120835
 */
public class Problem120835 {

  /*public int[] solution(int[] emergency) {

    List<Integer> emergencyList = Arrays.stream(emergency)
        .sorted()
        .boxed()
        .collect(Collectors.toList());
    Collections.reverse(emergencyList);

    List<Integer> answerList = new ArrayList<>();
    for (int a = 0; a < emergency.length; a++) {
      int emergencyValue = emergency[a];
      for (int b = 0; b < emergencyList.size(); b++) {
        if (emergencyValue == emergencyList.get(b)) {
          answerList.add(b + 1);
        }
      }
    }

    return answerList.stream().mapToInt(Integer::intValue).toArray();
  }*/

  public int[] solution(int[] emergency) {
    return Arrays.stream(emergency)
        .map(m ->
            Arrays.stream(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .indexOf(m) + 1)
        .toArray();
  }
}
