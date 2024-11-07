package level02.p12000_12999;

/**
 * JadenCase 문자열 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */
public class Problem12951 {

  public String solution(String s) {

    StringBuilder sb = new StringBuilder();
    String[] sArr = s.split(" ", -1);

    for (String sStr : sArr) {
      if (!sStr.isEmpty()) {
        if (Character.isLetter(sStr.charAt(0))) {
          sb.append(sStr.substring(0, 1).toUpperCase())
              .append(sStr.substring(1).toLowerCase());
        } else {
          sb.append(sStr.toLowerCase());
        }
      }
      sb.append(" ");
    }

    return sb.substring(0, sb.length() - 1);
  }
}
