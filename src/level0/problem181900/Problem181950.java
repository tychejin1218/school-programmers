package level0.problem181900;

import java.util.Scanner;

/**
 * 문자열 반복해서 출력하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */
public class Problem181950 {

  /*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    Stream.generate(() -> str)
        .limit(n)
        .forEach(System.out::print);
  }*/

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    System.out.println(str.repeat(n));
  }
}
