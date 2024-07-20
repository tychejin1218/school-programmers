package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181936Test {

  @Test
  void solution01() {

    // Given
    int number = 60;
    int n = 2;
    int m = 3;
    int expected = 1;

    // When
    int result = new Problem181936().solution(number, n, m);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int number = 55;
    int n = 10;
    int m = 5;
    int expected = 0;

    // When
    int result = new Problem181936().solution(number, n, m);

    // Then
    assertEquals(expected, result);
  }
}