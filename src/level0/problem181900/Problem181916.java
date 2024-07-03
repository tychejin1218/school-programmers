package level0.problem181900;

import java.util.Arrays;
import java.util.List;

/**
 * 주사위 게임 3
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181916
 */
public class Problem181916 {

  public int solution(int a, int b, int c, int d) {
    int answer = 0;

    int[] numbers = new int[6];

    List<Integer> numberList = Arrays.asList(a, b, c, d);
    for (int number : numberList) {
      numbers[number - 1]++;
    }

    int countMax = Arrays.stream(numbers).max().getAsInt();
    int countMin = countMax != 4 ? Arrays.stream(numbers).filter(i -> i > 0).min().getAsInt() : 0;
    int numberMax = 0;
    int numberMin = 0;

    if (countMax == 4) {
      numberMax = a;
    } else if (countMax == 3) {
      for (int i = 0; i < numbers.length; i++) {
        if (countMin == numbers[i] && numberMin == 0) {
          numberMin = i + 1;
        } else if (countMax == numbers[i] && numberMax == 0) {
          numberMax = i + 1;
        }
      }
    } else if (countMax == 2 && countMin == 2) {
      for (int i = 0; i < numbers.length; i++) {
        if (countMin == numbers[i] && numberMin == 0) {
          numberMin = i + 1;
        } else if (countMax == numbers[i] && numberMax == 0) {
          numberMax = i + 1;
        }
      }
    } else if (countMax == 2 && countMin != 2) {
      for (int i = 0; i < numbers.length; i++) {
        if (countMax != numbers[i] && numbers[i] > 0 && numberMin == 0) {
          numberMin = i + 1;
        } else if (countMax != numbers[i] && numbers[i] > 0 && numberMax == 0) {
          numberMax = i + 1;
        }
      }
    } else if (countMax == 1 && countMin == 1) {
      for (int i = 0; i < numbers.length; i++) {
        if (countMax == numbers[i] && numberMin == 0) {
          numberMin = i + 1;
        }
      }
    }

    if (countMax == 4) {
      answer = 1111 * numberMax;
    } else if (countMax == 3) {
      answer = (int) Math.pow((10 * numberMax + numberMin), 2);
    } else if (countMax == 2 && countMin == 2) {
      answer = (numberMax + numberMin) * Math.abs(numberMax - numberMin);
    } else if (countMax == 2 && countMin != 2) {
      answer = numberMax * numberMin;
    } else if (countMax == 1 && countMin == 1) {
      answer = numberMin;
    }

    return answer;
  }
}
