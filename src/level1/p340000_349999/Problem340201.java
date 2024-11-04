package level1.p340000_349999;

/**
 * [PCCE 기출문제] 7번 / 버스
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340201
 */
public class Problem340201 {

  public int solution(int seat, String[][] passengers) {
    int num_passenger = 0;
    for (int i = 0; i < passengers.length; i++) {
      num_passenger += func4(passengers[i]);
      num_passenger -= func3(passengers[i]);
    }
    System.out.println("num_passenger: " + num_passenger);
    int answer = func1(seat - num_passenger);
    return answer;
  }

  public int func1(int num) {
    if (0 > num) {
      return 0;
    } else {
      return num;
    }
  }

  public int func2(int num) {
    if (num > 0) {
      return 0;
    } else {
      return num;
    }
  }

  public int func3(String[] station) {
    int num = 0;
    for (int i = 0; i < station.length; i++) {
      if (station[i].equals("Off")) {
        num += 1;
      }
    }
    return num;
  }

  public int func4(String[] station) {
    int num = 0;
    for (int i = 0; i < station.length; i++) {
      if (station[i].equals("On")) {
        num += 1;
      }
    }
    return num;
  }
}
