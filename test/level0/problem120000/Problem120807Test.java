package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120807Test {

  @Test
  void solution01() {

    // Given
    int num1 = 2;
    int num2 = 3;
    int expected = -1;

    // When
    int result = new Problem120807().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num1 = 11;
    int num2 = 11;
    int expected = 1;

    // When
    int result = new Problem120807().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int num1 = 7;
    int num2 = 99;
    int expected = -1;

    // When
    int result = new Problem120807().solution(num1, num2);

    // Then
    assertEquals(expected, result);
  }
}
