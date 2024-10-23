package level0.p181900_181999;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 접미사인지 확인하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909
 */
public class Problem181909 {

  public String[] solution01(String my_string) {

    List<String> answers = new ArrayList<>();

    int myStringLen = my_string.length();
    int idx = 0;
    while (idx < myStringLen) {
      answers.add(my_string.substring(idx, myStringLen));
      idx++;
    }

    return answers.stream()
        .sorted(String::compareTo)
        .toArray(String[]::new);
  }

  public String[] solution(String my_string) {
    int myStringLen = my_string.length();
    return IntStream.range(0, myStringLen)
        .mapToObj(idx -> my_string.substring(idx, myStringLen))
        .sorted(String::compareTo)
        .toArray(String[]::new);
  }
}
