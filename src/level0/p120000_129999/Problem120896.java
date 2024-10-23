package level0.p120000_129999;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 한 번만 등장한 문자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120896
 */
public class Problem120896 {

  public String solution01(String s) {

    List<String> strList = Arrays.stream(s.split(""))
        .collect(Collectors.toList());
    Collections.sort(strList);

    Set<String> strSet = strList.stream()
        .filter(p -> Collections.frequency(strList, p) > 1)
        .collect(Collectors.toSet());
    for (String dStr : strSet) {
      strList.removeIf(str -> str.equals(dStr));
    }

    return strList.stream()
        .collect(Collectors.joining());
  }

  public String solution(String s) {
    return Arrays.stream(s.split(""))
        .collect(Collectors.groupingBy(s1 -> s1))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue().size() <= 1)
        .map(Map.Entry::getKey)
        .sorted()
        .collect(Collectors.joining());
  }
}
