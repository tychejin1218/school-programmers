package level0.p120000_129999;

/**
 * 로그인 성공?
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */
public class Problem120883 {

  public String solution(String[] id_pw, String[][] db) {
    String answer = "";

    for (int a = 0; a < db.length; a++) {
      if (id_pw[0].equals(db[a][0])) {
        if (id_pw[1].equals(db[a][1])) {
          answer = "login";
        } else {
          answer = "wrong pw";
        }
        break;
      }
    }

    return "".equals(answer) ? "fail" : answer;
  }
}
