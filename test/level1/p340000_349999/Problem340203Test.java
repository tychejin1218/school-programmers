package level1.p340000_349999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem340203Test {

  @Test
  void solution01() {

    // Given
    String[] cpr = {"call", "respiration", "repeat", "check", "pressure"};
    int[] expected = {2, 4, 5, 1, 3};

    // When
    int[] result = new Problem340203().solution(cpr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] cpr = {"respiration", "repeat", "check", "pressure", "call"};
    int[] expected = {4, 5, 1, 3, 2};

    // When
    int[] result = new Problem340203().solution(cpr);

    // Then
    assertArrayEquals(expected, result);
  }
}
