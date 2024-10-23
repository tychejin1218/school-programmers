package level0.p181800_181899;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문자열 묶기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181855
 */
public class Problem181855 {

  public int solution01(String[] strArr) {

    int[] lenArr = IntStream.range(0, strArr.length)
        .map(i -> strArr[i].length())
        .toArray();

    Map<Integer, Integer> lenMap = new HashMap<>();
    for (int i = 0; i < lenArr.length; i++) {
      int key = lenArr[i];
      int value = lenMap.get(key) == null ? 0 : lenMap.get(key);
      lenMap.put(key, value + 1);
    }

    return lenMap.entrySet().stream()
        .mapToInt(Map.Entry::getValue)
        .max()
        .getAsInt();
  }

  public int solution02(String[] strArr) {

    Map<Integer, Integer> strMap = new HashMap<>();

    for (String str : strArr) {
      int strLen = str.length();
      strMap.put(strLen, strMap.getOrDefault(strLen, 0) + 1);
    }

    return Collections.max(strMap.values());
  }

  public int solution(String[] strArr) {
    return Arrays.stream(strArr)
        .collect(Collectors.groupingBy(String::length, Collectors.counting()))
        .values()
        .stream()
        .mapToInt(Long::intValue)
        .max()
        .orElse(0);
  }
}
