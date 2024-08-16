package level1;

/**
 * [1차] 비밀지도
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */
public class Problem17681 {

  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = {};

    String[] binaryArr1 = new String[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      binaryArr1[i] = Integer.toBinaryString(arr1[i]);
    }

    String[] binaryArr2 = new String[arr2.length];
    for (int i = 0; i < arr1.length; i++) {
      binaryArr2[i] = Integer.toBinaryString(arr2[i]);
    }

    String[] binaryArrSum = new String[arr1.length];
    for (int i = 0; i < binaryArr1.length; i++) {
      binaryArrSum[i] = String.format("%5s",
          String.valueOf(
              Integer.parseInt(binaryArr1[i]) + Integer.parseInt(binaryArr2[i])).replace(' ', '0'));
    }

    return answer;
  }
}
