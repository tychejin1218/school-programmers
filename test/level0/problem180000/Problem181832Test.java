package level0.problem180000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181832Test {

  @Test
  void solution01() {

    // Given
    int n = 4;
    int[][] expected = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};

    // When
    int[][] result = new Problem181832().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int[][] expected = {{1, 2, 3, 4, 5}, {16, 17, 18, 19, 6}, {15, 24, 25, 20, 7},
        {14, 23, 22, 21, 8}, {13, 12, 11, 10, 9}};

    // When
    int[][] result = new Problem181832().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
