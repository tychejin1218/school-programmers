package level02.p12000_12999;

import java.util.Arrays;

/**
 * 최솟값 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12941
 */
public class Problem12941 {

  public int solution(int[] A, int[] B) {
    int answer = 0;

    Arrays.sort(A);
    Arrays.sort(B);

    for (int i = 0; i < A.length; i++) {
      answer += A[i] * B[A.length - 1 - i];
    }

    return answer;
  }
}
