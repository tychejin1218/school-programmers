package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120882Test {

  @Test
  void solution01() {

    // Given
    int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
    int[] expected = {1, 2, 4, 3};

    // When
    int[] result = new Problem120882().solution(score);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
    int[] expected = {4, 4, 6, 2, 2, 1, 7};

    // When
    int[] result = new Problem120882().solution(score);

    // Then
    assertArrayEquals(expected, result);
  }
}
