package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181883Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 2, 3, 4};
    int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
    int[] expected = {1, 3, 4, 4, 4};

    // When
    int[] result = new Problem181883().solution(arr, queries);

    // Then
    assertArrayEquals(expected, result);
  }
}
