package level0.problem181900;

/**
 * 문자 개수 세기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */
public class Problem181902 {

  public int[] solution01(String my_string) {

    int[] answer = new int[52];

    char[] myString = my_string.toCharArray();
    for (int i = 0; i < myString.length; i++) {
      int ascii = myString[i];
      int index;
      if (ascii >= 65 && ascii <= 90) {
        index = ascii - 65;
        answer[index]++;
      } else if (ascii >= 97 && ascii <= 122) {
        index = ascii - 97 + 26;
        answer[index]++;
      }
    }

    return answer;
  }

  public int[] solution(String my_string) {

    int[] answer = new int[52];

    for (char ch : my_string.toCharArray()) {
      if ('A' <= ch && ch <= 'Z') {
        answer[ch - 'A']++;
      } else if ('a' <= ch && ch <= 'z') {
        answer[ch - 'a' + 26]++;
      }
    }

    return answer;
  }
}
