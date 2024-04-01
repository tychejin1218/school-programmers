package level0.problem180000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181833Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    int[][] expected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

    // When
    int[][] result = new Problem181833().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 6;
    int[][] expected = {{1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}};

    // When
    int[][] result = new Problem181833().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 1;
    int[][] expected = {{1}};

    // When
    int[][] result = new Problem181833().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
