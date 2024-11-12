package level1.p340000_349999;

/**
 * [PCCE 기출문제] 8번 / 닉네임 규칙
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340200
 */
public class Problem340200 {

  public String solution(String nickname) {
    String answer = "";
    for (int i = 0; i < nickname.length(); i++) {
      if (nickname.charAt(i) == 'l') {
        answer += "I";
      } else if (nickname.charAt(i) == 'w') {
        answer += "vv";
      } else if (nickname.charAt(i) == 'W') {
        answer += "VV";
      } else if (nickname.charAt(i) == 'O') {
        answer += "0";
      } else {
        answer += nickname.charAt(i);
      }
    }
    while (answer.length() < 4) {
      answer += "o";
    }
    if (answer.length() > 8) {
      answer = answer.substring(0, 8);
    }
    return answer;
  }
}