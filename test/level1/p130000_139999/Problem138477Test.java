package level1.p130000_139999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem138477Test {

  @Test
  void solution01() {

    // Given
    int k = 3;
    int[] score = {10, 100, 20, 150, 1, 100, 200};
    int[] expected = {10, 10, 10, 20, 20, 100, 100};

    // When
    int[] result = new Problem138477().solution(k, score);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int k = 4;
    int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
    int[] expected = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};

    // When
    int[] result = new Problem138477().solution(k, score);

    // Then
    assertArrayEquals(expected, result);
  }
}
