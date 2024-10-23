package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120847Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3, 4, 5};
    int expected = 20;

    // When
    int result = new Problem120847().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {0, 31, 24, 10, 1, 9};
    int expected = 744;

    // When
    int result = new Problem120847().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
