package level0.problem181800;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181835Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 3, 100, 99, 98};
    int k = 3;
    int[] expected = {3, 6, 9, 300, 297, 294};

    // When
    int[] result = new Problem181835().solution(arr, k);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {1, 2, 3, 100, 99, 98};
    int k = 2;
    int[] expected = {3, 4, 5, 102, 101, 100};

    // When
    int[] result = new Problem181835().solution(arr, k);

    // Then
    assertArrayEquals(expected, result);
  }
}
