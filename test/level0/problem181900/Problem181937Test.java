package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181937Test {

  @Test
  void solution01() {

    // Given
    int num = 98;
    int n = 2;
    int expected = 1;

    // When
    int result = new Problem181937().solution(num, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num = 34;
    int n = 3;
    int expected = 0;

    // When
    int result = new Problem181937().solution(num, n);

    // Then
    assertEquals(expected, result);
  }
}