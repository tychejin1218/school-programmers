package level02.p1800_1899;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1844Test {

  @Test
  void solution01() {

    // Given
    int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1},
        {0, 0, 0, 0, 1}};
    int expected = 11;

    // When
    int result = new Problem1844().solution(maps);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0},
        {0, 0, 0, 0, 1}};
    int expected = -1;

    // When
    int result = new Problem1844().solution(maps);

    // Then
    assertEquals(expected, result);
  }
}
