package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181895Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 3, 4, 5};
    int[][] intervals = {{1, 3}, {0, 4}};
    int[] expected = {2, 3, 4, 1, 2, 3, 4, 5};

    // When
    int[] result = new Problem181895().solution(arr, intervals);

    // Then
    assertArrayEquals(expected, result);
  }
}
