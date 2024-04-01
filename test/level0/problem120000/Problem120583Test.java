package level0.problem120000;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem120583Test {

  @Test
  void solution01() {

    // Given
    int[] array = {1, 1, 2, 3, 4, 5};
    int n = 1;
    int expected = 2;

    // When
    int result = new Problem120583().solution(array, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {0, 2, 3, 4};
    int n = 1;
    int expected = 0;

    // When
    int result = new Problem120583().solution(array, n);

    // Then
    assertEquals(expected, result);
  }
}
