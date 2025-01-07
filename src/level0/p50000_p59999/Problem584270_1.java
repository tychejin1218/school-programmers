package level0.p50000_p59999;

import java.util.ArrayList;
import java.util.List;

public class Problem584270_1 {

  public String solution(String X, String Y) {

    int[] xArr = new int[10];
    int[] yArr = new int[10];

    for (char ch : X.toCharArray()) {
      xArr[ch - '0']++;
    }

    for (char ch : Y.toCharArray()) {
      yArr[ch - '0']++;
    }

    List<Integer> resultList = new ArrayList<>();
    for (int i = 9; i >= 0; i--){
      int count = Math.min(xArr[i], yArr[i]);
      for(int j = 0; j < count; j++){
        resultList.add(i);
      }
    }

    if (resultList.isEmpty()) {
      return "-1";
    }

    if (resultList.size() == 1 && resultList.get(0) == 0) {
      return "0";
    }

    StringBuilder answer = new StringBuilder();
    for(int num : resultList){
      answer.append(num);
    }

    return answer.toString();
  }
}
