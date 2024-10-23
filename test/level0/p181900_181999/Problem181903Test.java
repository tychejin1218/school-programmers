package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181903Test {

  @Test
  void solution01() {

    // Given
    int q = 3;
    int r = 1;
    String code = "qjnwezgrpirldywt";
    String expected = "jerry";

    // When
    String result = new Problem181903().solution(q, r, code);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int q = 1;
    int r = 0;
    String code = "programmers";
    String expected = "programmers";

    // When
    String result = new Problem181903().solution(q, r, code);

    // Then
    assertEquals(expected, result);
  }
}
