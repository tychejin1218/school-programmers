package level1.p12000_12999;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 핸드폰 번호 가리기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */
public class Problem12948 {

  public String solution(String phone_number) {
    char[] phoneNumbers = phone_number.toCharArray();
    return IntStream.range(0, phoneNumbers.length)
        .mapToObj(i -> i >= phoneNumbers.length - 4 ? phoneNumbers[i] : "*")
        .map(String::valueOf)
        .collect(Collectors.joining());
  }
}
