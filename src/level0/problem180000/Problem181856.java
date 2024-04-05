package level0.problem180000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열 비교하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181856
 */
public class Problem181856 {

  public int solution01(int[] arr1, int[] arr2) {
    int answer = 0;

    int arr1Len = arr1.length;
    int arr2Len = arr2.length;
    int arr1Sum = Arrays.stream(arr1).sum();
    int arr2Sum = Arrays.stream(arr2).sum();

    if (arr1Len > arr2Len) {
      answer = 1;
    } else if (arr1Len < arr2Len) {
      answer = -1;
    } else {
      if (arr1Sum > arr2Sum) {
        answer = 1;
      } else if (arr1Sum < arr2Sum) {
        answer = -1;
      }
    }

    return answer;
  }

  public int solution(int[] arr1, int[] arr2) {
    int answer = Integer.compare(arr1.length, arr2.length);
    if (answer == 0) {
      answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
    }
    return answer;
  }
}
