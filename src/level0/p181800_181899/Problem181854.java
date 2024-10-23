package level0.p181800_181899;

import java.util.stream.IntStream;

/**
 * 배열의 길이에 따라 다른 연산하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181854
 */
public class Problem181854 {

  public int[] solution01(int[] arr, int n) {

    int arrLen = arr.length;
    int[] answer = new int[arrLen];
    int addIndex = arrLen % 2 == 0 ? 1 : 0;

    for (int a = 0; a < arrLen; a++) {
      if (a == addIndex) {
        answer[a] = arr[a] + n;
        addIndex = addIndex + 2;
      } else {
        answer[a] = arr[a];
      }
    }

    return answer;
  }

  public int[] solution(int[] arr, int n) {
    int arrLen = arr.length;
    int addIndex = arrLen % 2 == 0 ? 1 : 0;
    int[] answer = IntStream.range(0, arrLen)
        .map(i -> i % 2 == addIndex ? arr[i] + n : arr[i])
        .toArray();
    return answer;
  }
}
