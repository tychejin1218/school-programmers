package level1.p150000_159999;

/**
 * 둘만의 암호
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/155652
 */
public class Problem155652 {

  public String solution(String s, String skip, int index) {

    char[] charSkipArr = skip.toCharArray();
    char[] charSArr = s.toCharArray();
    char[] charAnswerArr = new char[charSArr.length];

    for (int i = 0; i < charSArr.length; i++) {
      char currentChar = charSArr[i];
      for (int j = 0; j < index; j++) {
        currentChar++;
        if (currentChar > 'z') {
          currentChar = 'a';
        }
        for (char charSkip : charSkipArr) {
          if (currentChar == charSkip) {
            j--;
            break;
          }
        }
      }
      charAnswerArr[i] = currentChar;
    }

    return String.valueOf(charAnswerArr);
  }

  public String solution01(String s, String skip, int index) {

    StringBuilder answer = new StringBuilder();
    StringBuilder alphabet = new StringBuilder();

    for (char ch = 'a'; ch <= 'z'; ch++) {
      if (skip.indexOf(ch) == -1) {
        alphabet.append(ch);
      }
    }

    int alphabetLength = alphabet.length();
    for (char ch : s.toCharArray()) {
      int originalPos = alphabet.indexOf(String.valueOf(ch));
      int newPos = (originalPos + index) % alphabetLength;
      answer.append(alphabet.charAt(newPos));
    }

    return answer.toString();
  }
}
