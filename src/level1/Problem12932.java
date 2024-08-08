package level1;

/**
 * 자연수 뒤집어 배열로 만들기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Problem12932 {

  public int[] solution(long n) {
    return new StringBuilder(String.valueOf(n))
        .reverse()
        .toString()
        .chars()
        .map(Character::getNumericValue)
        .toArray();
  }
}
