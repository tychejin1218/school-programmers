package level0;

/**
 * 대문자와 소문자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */
public class Problem120893 {

  public String solution(String my_string) {

    char[] myChars = my_string.toCharArray();
    for (int a = 0; a < myChars.length; a++) {
      if (Character.isUpperCase(myChars[a])) {
        myChars[a] = Character.toLowerCase(myChars[a]);
      } else {
        myChars[a] = Character.toUpperCase(myChars[a]);
      }
    }

    return new String(myChars);
  }
  
}
