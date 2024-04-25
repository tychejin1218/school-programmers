package level0.problem180000;

import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 2
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 */
public class Problem181881 {

  public int solution01(int[] arr) {
    int answer = 0;

    int arrLen = arr.length;
    int[] previousArr = new int[arrLen];
    int[] currentArr = Arrays.copyOf(arr, arrLen);

    while (!Arrays.equals(previousArr, currentArr)) {
      int[] tempArr = Arrays.stream(currentArr)
          .map(i -> {
            int result = 0;
            if (i >= 50 && i % 2 == 0) {
              result = i / 2;
            } else if (i < 50 && i % 2 != 0) {
              result = i * 2 + 1;
            } else {
              result = i;
            }
            return result;
          })
          .toArray();
      previousArr = Arrays.copyOf(currentArr, arrLen);
      currentArr = Arrays.copyOf(tempArr, arrLen);
      answer++;
    }

    return answer - 1;
  }

  public int solution(int[] arr) {
    int answer = 0;

    int arrLen = arr.length;
    int[] previousArr = new int[arrLen];
    int[] currentArr = arr.clone();

    while (!Arrays.equals(previousArr, currentArr)) {
      int[] tempArr = Arrays.stream(currentArr)
          .map(i -> {
            int result = 0;
            if (i >= 50 && i % 2 == 0) {
              result = i / 2;
            } else if (i < 50 && i % 2 != 0) {
              result = i * 2 + 1;
            } else {
              result = i;
            }
            return result;
          })
          .toArray();
      previousArr = currentArr.clone();
      currentArr = tempArr.clone();
      answer++;
    }

    return answer - 1;
  }
}
