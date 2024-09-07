package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem86491Test {

  @Test
  void solution01() {

    // Given
    int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    int expected = 4000;

    // When
    int result = new Problem86491().solution(sizes);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    int expected = 120;

    // When
    int result = new Problem86491().solution(sizes);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
    int expected = 133;

    // When
    int result = new Problem86491().solution(sizes);

    // Then
    assertEquals(expected, result);
  }
}
