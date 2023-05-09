package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120912Test {

  @Test
  void solution01() {

    // Given
    int[] array = {7, 77, 17};
    int expected = 4;

    // When
    int result = new Problem120912().solution(array);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {10, 29};
    int expected = 0;

    // When
    int result = new Problem120912().solution(array);

    // Then
    assertEquals(expected, result);
  }
}
