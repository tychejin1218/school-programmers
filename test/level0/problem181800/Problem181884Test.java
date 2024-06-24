package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181884Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {34, 5, 71, 29, 100, 34};
    int n = 123;
    int expected = 139;

    // When
    int result = new Problem181884().solution(numbers, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {58, 44, 27, 10, 100};
    int n = 139;
    int expected = 239;

    // When
    int result = new Problem181884().solution(numbers, n);

    // Then
    assertEquals(expected, result);
  }
}
