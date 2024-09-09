package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem132267Test {

  @Test
  void solution01() {

    // Given
    int a = 2;
    int b = 1;
    int n = 20;
    int expected = 19;

    // When
    int result = new Problem132267().solution(a, b, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 3;
    int b = 1;
    int n = 20;
    int expected = 9;

    // When
    int result = new Problem132267().solution(a, b, n);

    // Then
    assertEquals(expected, result);
  }
}
