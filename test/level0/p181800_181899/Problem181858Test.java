package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181858Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 1, 2, 2, 3};
    int k = 3;
    int[] expected = {0, 1, 2};

    // When
    int[] result = new Problem181858().solution(arr, k);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {0, 1, 1, 1, 1};
    int k = 4;
    int[] expected = {0, 1, -1, -1};

    // When
    int[] result = new Problem181858().solution(arr, k);

    // Then
    assertArrayEquals(expected, result);
  }
}
