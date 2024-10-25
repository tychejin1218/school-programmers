package level1.p110000_119999;

import java.util.HashMap;
import java.util.Map;

/**
 * 성격 유형 검사하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */
public class Problem118666 {

  public String solution(String[] survey, int[] choices) {

    Map<String, Integer> surveyMap = new HashMap<>();
    surveyMap.put("R", 0);
    surveyMap.put("T", 0);
    surveyMap.put("C", 0);
    surveyMap.put("F", 0);
    surveyMap.put("J", 0);
    surveyMap.put("M", 0);
    surveyMap.put("A", 0);
    surveyMap.put("N", 0);

    for (int i = 0; i < choices.length; i++) {
      int choice = choices[i];
      if (choice > 4) {
        String tempSurvey = survey[i].substring(1, 2);
        surveyMap.put(tempSurvey, surveyMap.get(tempSurvey) + (choice % 4));
      } else if (choice < 4) {
        String tempSurvey = survey[i].substring(0, 1);
        surveyMap.put(tempSurvey, surveyMap.get(tempSurvey) + (4 - choice));
      }
    }

    String survey1 = surveyMap.get("R") >= surveyMap.get("T") ? "R" : "T";
    String survey2 = surveyMap.get("C") >= surveyMap.get("F") ? "C" : "F";
    String survey3 = surveyMap.get("J") >= surveyMap.get("M") ? "J" : "M";
    String survey4 = surveyMap.get("A") >= surveyMap.get("N") ? "A" : "N";

    return survey1 + survey2 + survey3 + survey4;
  }
}
