package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120811Test {

  @Test
  void solution01() {

    // Given
    int[] array = {1, 2, 7, 10, 11};
    int expected = 7;

    // When
    int result = new Problem120811().solution(array);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {9, -1, 0};
    int expected = 0;

    // When
    int result = new Problem120811().solution(array);

    // Then
    assertEquals(expected, result);
  }
}
