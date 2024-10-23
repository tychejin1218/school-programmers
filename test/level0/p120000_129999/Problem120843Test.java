package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120843Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3, 4};
    int k = 2;
    int expected = 3;

    // When
    int result = new Problem120843().solution(numbers, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {1, 2, 3, 4, 5, 6};
    int k = 5;
    int expected = 3;

    // When
    int result = new Problem120843().solution(numbers, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] numbers = {1, 2, 3};
    int k = 3;
    int expected = 2;

    // When
    int result = new Problem120843().solution(numbers, k);

    // Then
    assertEquals(expected, result);
  }
}
