package level1.p150000_159999;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 개인정보 수집 유효기간
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/150370
 */
public class Problem150370 {

  public int[] solution(String today, String[] terms, String[] privacies) {

    List<Integer> answerList = new ArrayList<>();

    int totalDaysToday = convertDateToTotalDays(today);

    Map<String, Integer> termMap = new HashMap<>();
    for (String term : terms) {
      String[] termArr = term.split(" ");
      termMap.put(termArr[0], Integer.parseInt(termArr[1]) * 28);
    }

    for (int i = 0; i < privacies.length; i++) {
      String[] privacyArr = privacies[i].split(" ");
      int expirationDate = convertDateToTotalDays(privacyArr[0]) + termMap.get(privacyArr[1]);
      if (totalDaysToday >= expirationDate) {
        answerList.add(i + 1);
      }
    }

    return answerList.stream()
        .mapToInt(i -> i)
        .toArray();
  }

  public int convertDateToTotalDays(String date) {
    String[] dateArr = date.split("\\.");
    return (Integer.parseInt(dateArr[0]) * 12 * 28)
        + (Integer.parseInt(dateArr[1]) * 28)
        + (Integer.parseInt(dateArr[2]));
  }
}
