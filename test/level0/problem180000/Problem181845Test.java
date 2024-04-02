package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181845Test {

  @Test
  void solution01() {

    // Given
    int n = 123;
    String expected = "123";

    // When
    String result = new Problem181845().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 2573;
    String expected = "2573";

    // When
    String result = new Problem181845().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
