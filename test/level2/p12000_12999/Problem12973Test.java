package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12973Test {

  @Test
  void solution01() {

    // Given
    String s = "baabaa";
    int expected = 1;

    // When
    int result = new Problem12973().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "cdcd";
    int expected = 0;

    // When
    int result = new Problem12973().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
