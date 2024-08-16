package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12982Test {

  @Test
  void solution01() {

    // Given
    int[] d = {1, 3, 2, 5, 4};
    int budget = 9;
    int expected = 3;

    // When
    int result = new Problem12982().solution(d, budget);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] d = {2, 2, 3, 3};
    int budget = 10;
    int expected = 4;

    // When
    int result = new Problem12982().solution(d, budget);

    // Then
    assertEquals(expected, result);
  }
}
