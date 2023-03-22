package level0;

import java.util.Scanner;

/**
 * 직각삼각형 출력하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */
public class Problem120823 {

  /*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int a = 1; a < n + 1; a++) {
      for (int b = 0; b < a; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }*/

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int a = 1; a <= n; a++) {
      System.out.println("*".repeat(a));
    }
  }
}
