package level0.p181900_181999;

/**
 * 문자열 여러 번 뒤집기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181913
 */
public class Problem181913 {

  public String solution(String my_string, int[][] queries) {

    StringBuilder stringBuilder = new StringBuilder(my_string);

    for (int[] query : queries) {
      int s = query[0];
      int e = query[1];
      stringBuilder.replace(s, e + 1,
          new StringBuilder(my_string.substring(s, e + 1)).reverse().toString());
      my_string = stringBuilder.toString();
    }

    return my_string;
  }
}
