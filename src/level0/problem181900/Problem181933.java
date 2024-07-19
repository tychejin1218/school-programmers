package level0.problem181900;

/**
 * flag에 따라 다른 값 반환하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */
public class Problem181933 {

  public int solution(int a, int b, boolean flag) {
    return flag ? a + b : a - b;
  }
}
