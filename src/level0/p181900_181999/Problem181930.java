package level0.p181900_181999;

/**
 * 주사위 게임 2
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */
public class Problem181930 {

  public int solution(int a, int b, int c) {
    int answer = 0;

    int sum = a + b + c;
    int sumOfSquares = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    int sumOfCubes = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

    if (a != b && a != c && b != c) {
      answer = sum;
    } else if (a == b && b == c) {
      answer = sum * sumOfSquares * sumOfCubes;
    } else {
      answer = sum * sumOfSquares;
    }

    return answer;
  }
}
