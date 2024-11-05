package level02.p12000_12999;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 최댓값과 최솟값
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */
public class Problem12939 {

  public String solution01(String s) {
    String[] sArr = s.split(" ");
    List<Integer> sList = Arrays.stream(sArr)
        .map(Integer::parseInt)
        .sorted()
        .collect(Collectors.toList());
    return sList.get(0) + " " + sList.get(sList.size() - 1);
  }

  public String solution(String s) {
    IntSummaryStatistics stats = Arrays.stream(s.split(" "))
        .mapToInt(Integer::parseInt)
        .summaryStatistics();
    return stats.getMin() + " " + stats.getMax();
  }
}
