package level0.problem120000;

/**
 * 다항식 더하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120863
 */
public class Problem120863 {

  public String solution(String polynomial) {
    String answer = "";

    int xSum = 0;
    int nSum = 0;
    String[] polynomialArr = polynomial.split(" ");

    for (String polynomialStr : polynomialArr) {
      if (polynomialStr.contains("x")) {
        xSum += "x".equals(polynomialStr) ? 1 : Integer.valueOf(polynomialStr.replace("x", ""));
      } else if (!"+".equals(polynomialStr)) {
        nSum += Integer.valueOf(polynomialStr);
      }
    }

    if (xSum == 1) {
      answer += "x";
    } else if (xSum > 1) {
      answer += xSum + "x";
    }

    if (answer.contains("x") && nSum > 0) {
      answer += " + " + nSum;
    } else if (!answer.contains("x") && nSum > 0) {
      answer += nSum;
    }

    return answer;
  }
}
