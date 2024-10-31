package level1.p340000_349999;

import java.util.Scanner;

/**
 * [PCCE 기출문제] 3번 / 수 나누기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/340205
 */
public class Problem340205 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int answer = 0;

    for (int i = 0; i < number; i++) {
      answer += number % 100;
      number /= 100;
    }
    System.out.println(answer);
  }
}
