package level1.p12000_12999;

/**
 * 콜라츠 추측
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Problem12943 {

  public int solution(int num) {
    long n = num;
    for (int i = 0; i < 500; i++) {
      if (n == 1) {
        return i;
      }
      n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
    }
    return -1;
  }
}
