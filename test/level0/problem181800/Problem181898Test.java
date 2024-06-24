package level0.problem181800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181898Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 0, 0, 1};
    int idx = 1;
    int expected = 3;

    // When
    int result = new Problem181898().solution(arr, idx);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {1, 0, 0, 1, 0, 0};
    int idx = 4;
    int expected = -1;

    // When
    int result = new Problem181898().solution(arr, idx);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] arr = {1, 1, 1, 1, 0};
    int idx = 3;
    int expected = 3;

    // When
    int result = new Problem181898().solution(arr, idx);

    // Then
    assertEquals(expected, result);
  }
}
