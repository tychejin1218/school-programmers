package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem131705Test {

  @Test
  void solution01() {

    // Given
    int[] number = {-2, 3, 0, 2, -5};
    int expected = 2;

    // When
    int result = new Problem131705().solution(number);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] number = {-3, -2, -1, 0, 1, 2, 3};
    int expected = 5;

    // When
    int result = new Problem131705().solution(number);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] number = {-1, 1, -1, 1};
    int expected = 0;

    // When
    int result = new Problem131705().solution(number);

    // Then
    assertEquals(expected, result);
  }
}
