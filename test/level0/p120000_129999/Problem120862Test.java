package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120862Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, -3, 4, -5};
    int expected = 15;

    // When
    int result = new Problem120862().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {0, -31, 24, 10, 1, 9};
    int expected = 240;

    // When
    int result = new Problem120862().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] numbers = {10, 20, 30, 5, 5, 20, 5};
    int expected = 600;

    // When
    int result = new Problem120862().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
