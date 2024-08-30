package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem70128Test {

  @Test
  void solution01() {

    // Given
    int[] a = {1, 2, 3, 4};
    int[] b = {-3, -1, 0, 2};
    int expected = 3;

    // When
    int result = new Problem70128().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] a = {-1, 0, 1};
    int[] b = {1, 0, -1};
    int expected = -2;

    // When
    int result = new Problem70128().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
