package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181935Test {

  @Test
  void solution01() {

    // Given
    int n = 7;
    int expected = 16;

    // When
    int result = new Problem181935().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 10;
    int expected = 220;

    // When
    int result = new Problem181935().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
