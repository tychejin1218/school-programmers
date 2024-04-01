package level0.problem120000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 인덱스 바꾸기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */
public class Problem120895 {

  public String solution01(String my_string, int num1, int num2) {

    String[] myStrArr = my_string.split("");
    String str1 = myStrArr[num1];
    String str2 = myStrArr[num2];

    myStrArr[num1] = str2;
    myStrArr[num2] = str1;

    return String.join("", myStrArr);
  }

  public String solution(String myString, int num1, int num2) {
    List<String> list = Arrays.stream(myString.split(""))
        .collect(Collectors.toList());
    Collections.swap(list, num1, num2);

    return String.join("", list);
  }
}
