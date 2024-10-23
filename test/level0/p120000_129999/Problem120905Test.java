package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120905Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
    int[] expected = {6, 9, 12};

    // When
    int[] result = new Problem120905().solution(n, numlist);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int[] numlist = {1, 9, 3, 10, 13, 5};
    int[] expected = {10, 5};

    // When
    int[] result = new Problem120905().solution(n, numlist);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 12;
    int[] numlist = {2, 100, 120, 600, 12, 12};
    int[] expected = {120, 600, 12, 12};

    // When
    int[] result = new Problem120905().solution(n, numlist);

    // Then
    assertArrayEquals(expected, result);
  }
}
