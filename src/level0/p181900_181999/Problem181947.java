package level0.p181900_181999;

import java.util.Scanner;

/**
 * 덧셈식 출력하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181947
 */
public class Problem181947 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(String.format("%d + %d = %d", a, b, (a + b)));
  }
}
