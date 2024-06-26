package level0.problem181900;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 세로 읽기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181904
 */
public class Problem181904 {

  public String solution(String my_string, int m, int c) {

    List<String> strList = new ArrayList<>();

    int myStringLen = my_string.length() / m;
    for (int i = 0; i < myStringLen; i++) {
      strList.add(my_string.substring(c - 1 + (m * i), c + (m * i)));
    }

    return strList.stream().collect(Collectors.joining());
  }
}
