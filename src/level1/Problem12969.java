package level1;

import java.util.Scanner;

/**
 * x만큼 간격이 있는 n개의 숫자
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Problem12969 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      if (i < m - 1) {
        System.out.println();
      }
    }
  }
}
