package level0.p250000_259999;

import java.util.Scanner;

/**
 * [PCCE 기출문제] 2번 / 피타고라스의 정리
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/250132
 */
public class Problem250132 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int c = sc.nextInt();

    int aSquare = (int) Math.pow(a, 2);
    int cSquare = (int) Math.pow(c, 2);

    int b_square = cSquare - aSquare;
    System.out.println(b_square);
  }
}
