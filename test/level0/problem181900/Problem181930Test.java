package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181930Test {

  @Test
  void solution01() {

    // Given
    int a = 2;
    int b = 6;
    int c = 1;
    int expected = 9;

    // When
    int result = new Problem181930().solution(a, b, c);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 5;
    int b = 3;
    int c = 3;
    int expected = 473;

    // When
    int result = new Problem181930().solution(a, b, c);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int a = 4;
    int b = 4;
    int c = 4;
    int expected = 110592;

    // When
    int result = new Problem181930().solution(a, b, c);

    // Then
    assertEquals(expected, result);
  }
}
