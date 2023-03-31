package level0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem120841Test {

  @Test
  void solution01() {

    // Given
    int[] dot = {2, 4};
    int expected = 1;

    // When
    int result = new Problem120841().solution(dot);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] dot = {-7, 9};
    int expected = 2;

    // When
    int result = new Problem120841().solution(dot);

    // Then
    assertEquals(expected, result);
  }
}
