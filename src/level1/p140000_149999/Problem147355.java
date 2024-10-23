package level1.p140000_149999;

import java.util.stream.IntStream;

/**
 * 크기가 작은 부분 문자열
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class Problem147355 {

  public int solution01(String t, String p) {
    int answer = 0;
    long pVal = Long.parseLong(p);
    int pLen = p.length();

    for (int i = 0; i <= t.length() - pLen; i++) {
      long subVal = Long.parseLong(t.substring(i, i + pLen));
      if (subVal <= pVal) {
        answer++;
      }
    }

    return answer;
  }

  public int solution(String t, String p) {
    long pVal = Long.parseLong(p);
    int pLen = p.length();
    return (int) IntStream.rangeClosed(0, t.length() - pLen)
        .mapToObj(i -> Long.parseLong(t.substring(i, i + pLen)))
        .filter(i -> i <= pVal)
        .count();
  }
}
