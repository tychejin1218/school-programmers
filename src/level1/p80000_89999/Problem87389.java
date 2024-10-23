package level1.p80000_89999;

/**
 * 나머지가 1이 되는 수 찾기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class Problem87389 {

  public int solution(int n) {

    for (int i = 2; i < n / 2; i++) {
      if (n % i == 1) {
        return i;
      }
    }

    return n - 1;
  }
}
