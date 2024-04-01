package level0.problem120000;

/**
 * 다음에 올 숫자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120924
 */
public class Problem120924 {

  public int solution(int[] common) {
    int answer;

    int temp1 = common[1] - common[0];
    int temp2 = common[2] - common[1];

    if (temp1 == temp2) {
      answer = common[common.length - 1] + temp1;
    } else {
      answer = common[common.length - 1] * (common[1] / common[0]);
    }

    return answer;
  }
}
