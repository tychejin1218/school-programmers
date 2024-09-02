package level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 신규 아이디 추천
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 */
public class Problem72410 {

  public String solution(String new_id) {

    String newId;

    newId = new_id.toLowerCase();

    String regex = "[^a-z0-9._-]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(newId);
    newId = matcher.replaceAll("");

    newId = newId.replaceAll("\\.+", ".");

    newId = newId.replaceAll("^\\.|\\.$", "");

    if (newId.isEmpty()) {
      newId = "a";
    }

    if (newId.length() > 15) {
      newId = newId.substring(0, 15);
      newId = newId.replaceAll("^\\.|\\.$", "");
    }

    if (newId.length() < 3) {
      char lastChar = newId.charAt(newId.length() - 1);
      while (newId.length() < 3) {
        newId += lastChar;
      }
    }

    return newId;
  }
}
