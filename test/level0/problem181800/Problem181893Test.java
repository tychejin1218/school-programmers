package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181893Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 2, 3, 4, 5};
    int[] query = {4, 1, 2};
    int[] expected = {1, 2, 3};

    // When
    int[] result = new Problem181893().solution(arr, query);

    // Then
    assertArrayEquals(expected, result);
  }
}
