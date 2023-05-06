package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열의 유사도
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class Problem120903 {

  public int solution01(String[] s1, String[] s2) {
    int answer = 0;

    for (String str1 : s1) {
      for (String str2 : s2) {
        if (str1.equals(str2)) {
          answer++;
        }
      }
    }
    return answer;
  }

  public int solution(String[] s1, String[] s2) {
    List<String> s2List = Arrays.stream(s2)
        .collect(Collectors.toList());
    return (int) Arrays.stream(s1)
        .map(m -> s2List.contains(m))
        .filter(p -> p)
        .count();
  }
}
