package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12921Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int expected = 4;

    // When
    int result = new Problem12921().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int expected = 3;

    // When
    int result = new Problem12921().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
