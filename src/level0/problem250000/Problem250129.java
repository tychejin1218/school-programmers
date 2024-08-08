package level0.problem250000;

/**
 * [PCCE 기출문제] 5번 / 산책
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/250129
 */
public class Problem250129 {

  public int[] solution(String route) {
    int east = 0;
    int north = 0;
    int[] answer = new int[2];
    for (int i = 0; i < route.length(); i++) {
      switch (route.charAt(i)) {
        case 'N':
          north++;
          break;
        case 'S':
          north--;
          break;
        case 'E':
          east++;
          break;
        case 'W':
          east--;
          break;
      }
    }
    answer[0] = east;
    answer[1] = north;
    return answer;
  }
}
