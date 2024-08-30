package level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem68644Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {2, 1, 3, 4, 1};
    int[] expected = {2, 3, 4, 5, 6, 7};

    // When
    int[] result = new Problem68644().solution(numbers);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {5, 0, 2, 7};
    int[] expected = {2, 5, 7, 9, 12};

    // When
    int[] result = new Problem68644().solution(numbers);

    // Then
    assertArrayEquals(expected, result);
  }
}
