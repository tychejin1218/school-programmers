package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120890Test {

  @Test
  void solution01() {

    // Given
    int[] array = {3, 10, 28};
    int n = 20;
    int expected = 28;

    // When
    int result = new Problem120890().solution(array, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {10, 11, 12};
    int n = 13;
    int expected = 12;

    // When
    int result = new Problem120890().solution(array, n);

    // Then
    assertEquals(expected, result);
  }
}
