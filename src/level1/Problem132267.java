package level1;

/**
 * 콜라 문제
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class Problem132267 {

  public int solution(int a, int b, int n) {

    int totalReturnedBottles = 0;
    int currentBottles = n;

    while (currentBottles >= a) {
      int exchangedBottles = (currentBottles / a) * b;
      int remainingBottles = currentBottles % a;
      totalReturnedBottles += exchangedBottles;

      currentBottles = exchangedBottles + remainingBottles;
    }

    return totalReturnedBottles;
  }
}
