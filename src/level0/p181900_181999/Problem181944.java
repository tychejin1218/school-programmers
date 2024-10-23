package level0.p181900_181999;

import java.util.Scanner;

/**
 * 홀짝 구분하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */
public class Problem181944 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String message = n % 2 == 0 ? n + " is even" : n + " is odd";
    System.out.println(message);
  }
}
