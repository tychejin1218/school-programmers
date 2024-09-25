package level1;

/**
 * 문자열 나누기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/140108
 */
public class Problem140108 {

  public int solution(String s) {
    int answer = 0;
    int length = s.length();
    int i = 0;

    while (i < length) {
      char firstChar = s.charAt(i);
      int firstCount = 0;
      int secondCount = 0;

      while (i < length && (firstCount == 0 || firstCount != secondCount)) {
        if (s.charAt(i) == firstChar) {
          firstCount++;
        } else {
          secondCount++;
        }
        i++;
      }
      answer++;
    }

    return answer;
  }
}
