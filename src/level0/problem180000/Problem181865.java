package level0.problem180000;

/**
 * 간단한 식 계산하기
 * <p/>
 * https://school.programmers.co.kr/learn/courses/30/lessons/181865
 */
public class Problem181865 {

  public int solution(String binomial) {
    
    String[] binomials = binomial.split(" ");

    int a = Integer.parseInt(binomials[0]);
    int b = Integer.parseInt(binomials[2]);

    String op = binomials[1];
    switch (op) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      default:
        return 0;
    }
  }
}
