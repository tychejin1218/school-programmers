package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120809Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3, 4, 5};
    int[] expected = {2, 4, 6, 8, 10};

    // When
    int[] result = new Problem120809().solution(numbers);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {1, 2, 100, -99, 1, 2, 3};
    int[] expected = {2, 4, 200, -198, 2, 4, 6};

    // When
    int[] result = new Problem120809().solution(numbers);

    // Then
    assertArrayEquals(expected, result);
  }
}