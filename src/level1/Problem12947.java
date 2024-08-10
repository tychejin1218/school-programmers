package level1;

/**
 * 하샤드 수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class Problem12947 {

  public boolean solution(int x) {
    String xStr = String.valueOf(x);
    int xSum = xStr.chars()
        .map(Character::getNumericValue)
        .sum();
    return x % xSum == 0;
  }
}
