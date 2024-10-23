package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120875Test {

  @Test
  void solution01() {

    // Given
    int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
    int expected = 1;

    // When
    int result = new Problem120875().solution(dots);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
    int expected = 0;

    // When
    int result = new Problem120875().solution(dots);

    // Then
    assertEquals(expected, result);
  }
}
