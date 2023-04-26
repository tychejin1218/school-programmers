package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120889Test {

  @Test
  void solution01() {

    // Given
    int[] sides = {1, 2, 3};
    int expected = 2;

    // When
    int result = new Problem120889().solution(sides);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] sides = {3, 6, 2};
    int expected = 2;

    // When
    int result = new Problem120889().solution(sides);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] sides = {199, 72, 222};
    int expected = 1;

    // When
    int result = new Problem120889().solution(sides);

    // Then
    assertEquals(expected, result);
  }
}
