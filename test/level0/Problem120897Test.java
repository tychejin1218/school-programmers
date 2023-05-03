package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120897Test {

  @Test
  void solution01() {

    // Given
    int n = 24;
    int[] expected = {1, 2, 3, 4, 6, 8, 12, 24};

    // When
    int[] result = new Problem120897().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 29;
    int[] expected = {1, 29};

    // When
    int[] result = new Problem120897().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
