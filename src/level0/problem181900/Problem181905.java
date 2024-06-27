package level0.problem181900;

/**
 * 문자열 뒤집기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */
public class Problem181905 {

  public String solution01(String my_string, int s, int e) {

    int sIndex = s;
    int eIndex = e;
    String[] myStrings = my_string.split("");
    while (sIndex < eIndex) {
      String sStr = myStrings[sIndex];
      String eStr = myStrings[eIndex];
      myStrings[sIndex] = eStr;
      myStrings[eIndex] = sStr;
      sIndex++;
      eIndex--;
    }

    return String.join("", myStrings);
  }

  public String solution(String my_string, int s, int e) {
    StringBuilder strBuilder = new StringBuilder(my_string);
    strBuilder.replace(s, e + 1,
        new StringBuilder(my_string.substring(s, e + 1)).reverse().toString());
    return strBuilder.toString();
  }
}
