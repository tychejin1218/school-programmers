package level2.p40000_49999;

import java.util.Arrays;

/**
 * 전화번호 목록 도움말
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */
public class Problem42577 {

  public boolean solution(String[] phone_book) {
    boolean answer = true;

    Arrays.sort(phone_book);

    for (int i = 1; i < phone_book.length; i++) {
      if (phone_book[i].startsWith(phone_book[i - 1])) {
        return false;
      }
    }

    return answer;
  }
}

