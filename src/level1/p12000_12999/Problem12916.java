package level1.p12000_12999;

/**
 * 문자열 내 p와 y의 개수
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class Problem12916 {

  public boolean solution(String s) {

    long pCount = s.toLowerCase().chars()
        .filter(i -> i == 'p')
        .count();
    long yCount = s.toLowerCase().chars()
        .filter(i -> i == 'y')
        .count();

    return pCount == yCount ? true : false;
  }
}
