package level0;

/**
 * 영어가 싫어요
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120894
 */
public class Problem120894 {

  public long solution01(String numbers) {

    numbers = numbers.replaceAll("zero", String.valueOf(0));
    numbers = numbers.replaceAll("one", String.valueOf(1));
    numbers = numbers.replaceAll("two", String.valueOf(2));
    numbers = numbers.replaceAll("three", String.valueOf(3));
    numbers = numbers.replaceAll("four", String.valueOf(4));
    numbers = numbers.replaceAll("five", String.valueOf(5));
    numbers = numbers.replaceAll("six", String.valueOf(6));
    numbers = numbers.replaceAll("seven", String.valueOf(7));
    numbers = numbers.replaceAll("eight", String.valueOf(8));
    numbers = numbers.replaceAll("nine", String.valueOf(9));

    return Long.parseLong(numbers);
  }

  public long solution(String numbers) {

    String[] nubmerStrs = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    for (int a = 0; a < nubmerStrs.length; a++) {
      numbers = numbers.replaceAll(nubmerStrs[a], String.valueOf(a));
    }

    return Long.parseLong(numbers);
  }
}
