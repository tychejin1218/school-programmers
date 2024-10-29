package level1.p90000_99999;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 신고 결과 받기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 */
public class Problem92334 {

  public int[] solution(String[] id_list, String[] report, int k) {

    int[] answer = new int[id_list.length];

    Map<String, Set<String>> reporterMap = new HashMap<>();
    Map<String, Integer> reportedCountMap = new HashMap<>();

    Set<String> reportSet = Arrays.stream(report)
        .collect(Collectors.toSet());
    for (String tempReport : reportSet) {
      String[] tempReportArr = tempReport.split(" ");
      String reporter = tempReportArr[0];
      String reported = tempReportArr[1];

      reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0) + 1);

      if (!reporterMap.containsKey(reporter)) {
        reporterMap.put(reporter, new HashSet<>());
      }
      reporterMap.get(reporter).add(reported);
    }

    List<String> reportedIdList = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : reportedCountMap.entrySet()) {
      if (entry.getValue() >= k) {
        reportedIdList.add(entry.getKey());
      }
    }

    Map<String, Integer> idMap = new HashMap<>();
    for (String id : id_list) {
      idMap.put(id, 0);
    }

    for (Map.Entry<String, Set<String>> entry : reporterMap.entrySet()) {
      for (String value : entry.getValue()) {
        for (String reportedId : reportedIdList) {
          if (reportedId.equals(value)) {
            idMap.put(entry.getKey(), idMap.getOrDefault(entry.getKey(), 0) + 1);
          }
        }
      }
    }

    for (int i = 0; i < id_list.length; i++) {
      answer[i] = idMap.get(id_list[i]);
    }

    return answer;
  }
}
