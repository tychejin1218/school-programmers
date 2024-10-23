package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12903Test {

  @Test
  void solution01() {

    // Given
    String s = "abcde";
    String expected = "c";

    // When
    String result = new Problem12903().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "qwer";
    String expected = "we";

    // When
    String result = new Problem12903().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
