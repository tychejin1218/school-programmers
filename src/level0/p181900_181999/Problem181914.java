package level0.p181900_181999;

/**
 * 9로 나눈 나머지
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 */
public class Problem181914 {

  public int solution(String number) {
    return number.chars()
        .map(Character::getNumericValue)
        .sum() % 9;
  }
}
