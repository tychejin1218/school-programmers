package level0.p250000_259999;

import java.util.Scanner;

/**
 * [PCCE 기출문제] 4번 / 저축
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/250130
 */
public class Problem250130 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int before = sc.nextInt();
    int after = sc.nextInt();

    int money = start;
    int month = 1;
    while (money < 70) {
      money += before;
      month++;
    }
    while (money < 100) {
      money += after;
      month++;
    }

    System.out.println(month);
  }
}
