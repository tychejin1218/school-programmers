package level0;

/**
 * 외계어 사전
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120869
 */
public class Problem120869 {

  public int solution(String[] spell, String[] dic) {

    int answer = 2;
    int check = 0;

    for (String dicStr : dic) {

      for (String spellStr : spell) {
        if (dicStr.toString().indexOf(spellStr) != -1) {
          check++;
        }
      }

      if (check == spell.length) {
        answer = 1;
        break;
      } else {
        check = 0;
      }
    }

    return answer;
  }
}
