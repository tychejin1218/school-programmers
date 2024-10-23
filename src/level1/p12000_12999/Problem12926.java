package level1.p12000_12999;

/**
 * 시저 암호
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 */
public class Problem12926 {

  public String solution(String s, int n) {

    char[] inputChars = s.toCharArray();
    int inputCharsLen = inputChars.length;
    char[] answerChars = new char[inputCharsLen];
    for (int i = 0; i < inputCharsLen; i++) {
      char inputChar = inputChars[i];
      if (Character.isWhitespace(inputChar)) {
        answerChars[i] = inputChar;
      } else if (Character.isLowerCase(inputChar)) {
        answerChars[i] = (char) ((inputChar - 'a' + n) % 26 + 'a');
      } else if (Character.isUpperCase(inputChar)) {
        answerChars[i] = (char) ((inputChar - 'A' + n) % 26 + 'A');
      }
    }

    return String.valueOf(answerChars);
  }
}
