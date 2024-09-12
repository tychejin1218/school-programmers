package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem133502Test {

  @Test
  void solution01() {

    // Given
    int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    int expected = 2;

    // When
    int result = new Problem133502().solution(ingredient);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
    int expected = 0;

    // When
    int result = new Problem133502().solution(ingredient);

    // Then
    assertEquals(expected, result);
  }
}
