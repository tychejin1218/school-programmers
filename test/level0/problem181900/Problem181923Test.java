package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181923Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
    int[] expected = {3, 4, -1};

    // When
    int[] result = new Problem181923().solution(arr, queries);

    // Then
    assertArrayEquals(expected, result);
  }
}
