package level1.p340000_349999;

import java.util.Scanner;

/**
 * [PCCE 기출문제] 2번 / 각도 합치기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340206
 */
public class Problem340206 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angle1 = sc.nextInt();
    int angle2 = sc.nextInt();
    int sum_angle = (angle1 + angle2) % 360;
    System.out.println(sum_angle);
  }
}
