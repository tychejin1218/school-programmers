package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12928Test {

  @Test
  void solution01() {

    // Given
    int n = 12;
    int expected = 28;

    // When
    int result = new Problem12928().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int expected = 6;

    // When
    int result = new Problem12928().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
