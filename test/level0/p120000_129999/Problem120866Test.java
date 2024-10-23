package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120866Test {

  @Test
  void solution01() {

    // Given
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0}
    };
    int expected = 16;

    // When
    int result = new Problem120866().solution(board);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0}
    };
    int expected = 13;

    // When
    int result = new Problem120866().solution(board);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[][] board = {
        {1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1}
    };
    int expected = 0;

    // When
    int result = new Problem120866().solution(board);

    // Then
    assertEquals(expected, result);
  }
}
