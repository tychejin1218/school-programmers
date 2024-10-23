package level1.p60000_69999;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 키패드 누르기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/67256
 */
public class Problem67256 {

  public String solution(int[] numbers, String hand) {

    String[] answers = new String[numbers.length];

    Map<Integer, int[]> numberMap = new HashMap<>();
    numberMap.put(1, new int[]{0, 0});
    numberMap.put(2, new int[]{0, 1});
    numberMap.put(3, new int[]{0, 2});
    numberMap.put(4, new int[]{1, 0});
    numberMap.put(5, new int[]{1, 1});
    numberMap.put(6, new int[]{1, 2});
    numberMap.put(7, new int[]{2, 0});
    numberMap.put(8, new int[]{2, 1});
    numberMap.put(9, new int[]{2, 2});
    numberMap.put(0, new int[]{3, 1});
    numberMap.put(10, new int[]{3, 0});
    numberMap.put(11, new int[]{3, 2});

    List<Integer> leftList = List.of(1, 4, 7);
    List<Integer> rigthList = List.of(3, 6, 9);

    int leftIndex = 10;
    int rightIndex = 11;

    for (int i = 0; i < numbers.length; i++) {
      int number = numbers[i];
      if (leftList.contains(number)) {
        leftIndex = number;
        answers[i] = "L";
      } else if (rigthList.contains(number)) {
        rightIndex = number;
        answers[i] = "R";
      } else {
        int[] leftPos = numberMap.get(leftIndex);
        int[] rightPos = numberMap.get(rightIndex);
        int[] targetPos = numberMap.get(number);

        int leftDistance =
            Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
        int rightDistance =
            Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);

        if (leftDistance < rightDistance) {
          leftIndex = number;
          answers[i] = "L";
        } else if (leftDistance > rightDistance) {
          rightIndex = number;
          answers[i] = "R";
        } else {
          if (hand.equals("left")) {
            leftIndex = number;
            answers[i] = "L";
          } else {
            rightIndex = number;
            answers[i] = "R";
          }
        }
      }
    }

    return String.join("", answers);
  }
}
