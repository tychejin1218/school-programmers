package level2.p70000_79999;

/**
 * 괄호 회전하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/76502
 */
public class Problem76502 {

  public int solution(String s) {

    int answer = 0;

    if (removeBracketPairs(s)) {
      answer++;
    }

    for (int i = 0; i < s.length() - 1; i++) {
      s = s.substring(1) + s.charAt(0);
      if (removeBracketPairs(s)) {
        answer++;
      }
    }

    return answer;
  }

  public boolean removeBracketPairs(String s) {

    String previous = "";
    String replaceS = s;

    while (!replaceS.equals(previous)) {
      previous = replaceS;
      replaceS = replaceS.replaceAll("\\[]", "")
          .replaceAll("\\(\\)", "")
          .replaceAll("\\{}", "");
    }
    System.out.println(replaceS);

    return replaceS.isEmpty();
  }
}
