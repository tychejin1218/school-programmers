package level1.p60000_69999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem64061Test {

  @Test
  void solution01() {

    // Given
    int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}};
    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
    int expected = 4;

    // When
    int result = new Problem64061().solution(board, moves);

    // Then
    assertEquals(expected, result);
  }
}
