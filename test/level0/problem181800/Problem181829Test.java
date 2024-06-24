package level0.problem181800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181829Test {

  @Test
  void solution01() {

    // Given
    int[][] board = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
    int k = 2;
    int expected = 8;

    // When
    int result = new Problem181829().solution(board, k);

    // Then
    assertEquals(expected, result);
  }
}
