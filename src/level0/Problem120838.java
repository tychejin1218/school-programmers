package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 모스부호 (1)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120838
 */
public class Problem120838 {

  public String solution(String letter) {
    String[] morseArr = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    List<String> morseList = Arrays.asList(morseArr);
    return Arrays.stream(letter.split(" "))
        .map(m -> String.valueOf((char) (morseList.indexOf(m) + 97)))
        .collect(Collectors.joining());
  }
}
