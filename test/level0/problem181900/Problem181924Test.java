package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181924Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 2, 3, 4};
    int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
    int[] expected = {3, 4, 1, 0, 2};

    // When
    int[] result = new Problem181924().solution(arr, queries);

    // Then
    assertArrayEquals(expected, result);
  }
}
