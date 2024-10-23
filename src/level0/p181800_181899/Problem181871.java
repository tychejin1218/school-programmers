package level0.p181800_181899;

/**
 * 문자열이 몇 번 등장하는지 세기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181871
 */
public class Problem181871 {

  public int solution01(String myString, String pat) {
    int answer = 0;

    int repeatCount = (myString.length() - pat.length()) + 1;

    String[] myStrArr = new String[repeatCount];
    for (int i = 0; i < repeatCount; i++) {
      myStrArr[i] = myString.substring(i, pat.length() + i);
    }

    for (String myStr : myStrArr) {
      if (myStr.contains(pat)) {
        answer++;
      }
    }

    return answer;
  }

  public int solution(String myString, String pat) {
    int answer = 0;

    int idx = 0;
    while ((idx = myString.indexOf(pat, idx)) != -1) {
      answer++;
      idx += pat.length() - 1;
      System.out.println(idx);
    }

    return answer;
  }
}
