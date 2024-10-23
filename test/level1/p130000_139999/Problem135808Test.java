package level1.p130000_139999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem135808Test {

  @Test
  void solution01() {

    // Given
    int k = 3;
    int m = 4;
    int[] score = {1, 2, 3, 1, 2, 3, 1};
    int expected = 8;

    // When
    int result = new Problem135808().solution(k, m, score);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int k = 4;
    int m = 3;
    int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
    int expected = 33;

    // When
    int result = new Problem135808().solution(k, m, score);

    // Then
    assertEquals(expected, result);
  }
}
