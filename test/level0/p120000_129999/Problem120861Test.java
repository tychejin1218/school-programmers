package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120861Test {

  @Test
  void solution01() {

    // Given
    String[] keyinput = {"left", "right", "up", "right", "right"};
    int[] board = {11, 11};
    int[] expected = {2, 1};

    // When
    int[] result = new Problem120861().solution(keyinput, board);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] keyinput = {"down", "down", "down", "down", "down"};
    int[] board = {7, 9};
    int[] expected = {0, -4};

    // When
    int[] result = new Problem120861().solution(keyinput, board);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] keyinput = {"down", "down", "down", "down", "down"};
    int[] board = {1, 1};
    int[] expected = {0, -1};

    // When
    int[] result = new Problem120861().solution(keyinput, board);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String[] keyinput = {};
    int[] board = {1, 1};
    int[] expected = {0, 0};

    // When
    int[] result = new Problem120861().solution(keyinput, board);

    // Then
    assertArrayEquals(expected, result);
  }
}
