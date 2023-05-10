package level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 잘라서 배열로 저장하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */
public class Problem120913 {

  public String[] solution(String my_str, int n) {
    List<String> strList = new ArrayList<>();
    int myStrLen = my_str.length();
    for (int a = 0; a < myStrLen; a += n) {
      int beginIndex = a;
      int endIndex = a + n;
      if (myStrLen < endIndex) {
        strList.add(my_str.substring(beginIndex, myStrLen));
      } else {
        strList.add(my_str.substring(beginIndex, endIndex));
      }
    }
    return strList.toArray(String[]::new);
  }
}
