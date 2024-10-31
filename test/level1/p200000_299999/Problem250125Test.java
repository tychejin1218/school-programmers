package level1.p200000_299999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem250125Test {

  @Test
  void solution01() {

    // Given
    String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
        {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
    int h = 1;
    int w = 1;
    int expected = 2;

    // When
    int result = new Problem250125().solution(board, h, w);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
    int h = 0;
    int w = 1;
    int expected = 1;

    // When
    int result = new Problem250125().solution(board, h, w);

    // Then
    assertEquals(expected, result);
  }
}
