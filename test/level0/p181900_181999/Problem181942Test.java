package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181942Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
    int[] expected = {3, 2, 4, 6, 4};

    // When
    int[] result = new Problem181942().solution(arr, queries);

    // Then
    assertArrayEquals(expected, result);
  }
}
