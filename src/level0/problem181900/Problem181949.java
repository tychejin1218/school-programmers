package level0.problem181900;

import java.util.Scanner;

/**
 * 대소문자 바꿔서 출력하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */
public class Problem181949 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    for (char charA : a.toCharArray()) {
      if (Character.isUpperCase(charA)) {
        System.out.print(Character.toLowerCase(charA));
      } else {
        System.out.print(Character.toUpperCase(charA));
      }
    }
  }
}
