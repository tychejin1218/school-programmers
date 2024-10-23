package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120813Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int[] expected = {1, 3, 5, 7, 9};

    // When
    int[] result = new Problem120813().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 15;
    int[] expected = {1, 3, 5, 7, 9, 11, 13, 15};

    // When
    int[] result = new Problem120813().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
