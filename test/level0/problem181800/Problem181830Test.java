package level0.problem181800;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181830Test {

  @Test
  void solution01() {

    // Given
    int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
    int[][] expected = {{572, 22, 37, 0}, {287, 726, 384, 0}, {85, 137, 292, 0}, {487, 13, 876, 0}};

    // When
    int[][] result = new Problem181830().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] arr = {{57, 192, 534, 2}, {9, 345, 192, 999}};
    int[][] expected = {{57, 192, 534, 2}, {9, 345, 192, 999}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    // When
    int[][] result = new Problem181830().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[][] arr = {{1, 2}, {3, 4}};
    int[][] expected = {{1, 2}, {3, 4}};

    // When
    int[][] result = new Problem181830().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
