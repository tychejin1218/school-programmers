package level0.problem120000;

import java.util.Arrays;

/**
 * 최댓값 만들기 (2)
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120862
 */
public class Problem120862 {

  public int solution(int[] numbers) {
    Arrays.sort(numbers);
    int numberSize = numbers.length;
    int answerNumber1 = numbers[0] * numbers[1];
    int answerNumber2 = numbers[numberSize - 1] * numbers[numberSize - 2];
    return answerNumber1 >= answerNumber2 ? answerNumber1 : answerNumber2;
  }

  public int solution1(int[] numbers) {
    Arrays.sort(numbers);
    int numberSize = numbers.length;
    int answerNumber1 = numbers[0] * numbers[1];
    int answerNumber2 = numbers[numberSize - 1] * numbers[numberSize - 2];
    return Math.max(answerNumber1, answerNumber2);
  }
}
