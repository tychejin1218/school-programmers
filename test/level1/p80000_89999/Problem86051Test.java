package level1.p80000_89999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem86051Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
    int expected = 14;

    // When
    int result = new Problem86051().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {5, 8, 4, 0, 6, 7, 9};
    int expected = 6;

    // When
    int result = new Problem86051().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
