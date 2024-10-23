package level1.p17000_17999;

import java.util.stream.IntStream;

/**
 * [1차] 비밀지도
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */
public class Problem17681 {

  public String[] solution01(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];

    for (int i = 0; i < n; i++) {
      StringBuilder binaryString = new StringBuilder(
          Integer.toBinaryString(arr1[i] | arr2[i]));
      while (binaryString.length() < n) {
        binaryString.insert(0, '0');
      }
      answer[i] = binaryString.toString()
          .replaceAll("1", "#")
          .replaceAll("0", " ");
    }
    return answer;
  }

  public String[] solution(int n, int[] arr1, int[] arr2) {
    return IntStream.range(0, n)
        .mapToObj(i ->
            String.format("%" + n + "s",
                    Integer.toBinaryString(arr1[i] | arr2[i]))
                .replaceAll("1", "#")
                .replaceAll("0", " "))
        .toArray(String[]::new);
  }
}
