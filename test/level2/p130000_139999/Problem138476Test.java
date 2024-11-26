package level2.p130000_139999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem138476Test {

  @Test
  void solution01() {

    // Given
    int k = 6;
    int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
    int expected = 3;

    // When
    int result = new Problem138476().solution(k, tangerine);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int k = 4;
    int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
    int expected = 2;

    // When
    int result = new Problem138476().solution(k, tangerine);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int k = 2;
    int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
    int expected = 1;

    // When
    int result = new Problem138476().solution(k, tangerine);

    // Then
    assertEquals(expected, result);
  }
}
