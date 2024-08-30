package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem68935Test {

  @Test
  void solution01() {

    // Given
    int n = 45;
    int expected = 7;

    // When
    int result = new Problem68935().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 125;
    int expected = 229;

    // When
    int result = new Problem68935().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
