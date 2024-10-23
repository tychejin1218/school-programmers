package level1;

/**
 * [PCCE 기출문제] 9번 / 지폐 접기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340199
 */
public class Problem340199 {

  public int solution(int[] wallet, int[] bill) {

    int answer = 0;

    int walletX = wallet[0];
    int walletY = wallet[1];
    int billX = bill[0];
    int billY = bill[1];

    while ((walletX < billX || walletY < billY)
        && (walletX < billY || walletY < billX)) {

      if (billX > billY) {
        billX /= 2;
      } else {
        billY /= 2;
      }

      answer++;
    }

    return answer;
  }
}
