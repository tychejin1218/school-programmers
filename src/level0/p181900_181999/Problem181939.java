package level0.p181900_181999;

/**
 * 더 크게 합치기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class Problem181939 {

  public int solution(int a, int b) {
    int parsedAandB = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
    int parsedBandA = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
    return Math.max(parsedAandB, parsedBandA);
  }
}
