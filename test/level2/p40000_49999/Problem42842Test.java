package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem42842Test {

  @Test
  void solution01() {

    // Given
    int brown = 10;
    int yellow = 2;
    int[] expected = {4, 3};

    // When
    int[] result = new Problem42842().solution(brown, yellow);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int brown = 8;
    int yellow = 1;
    int[] expected = {3, 3};

    // When
    int[] result = new Problem42842().solution(brown, yellow);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int brown = 24;
    int yellow = 24;
    int[] expected = {8, 6};

    // When
    int[] result = new Problem42842().solution(brown, yellow);

    // Then
    assertArrayEquals(expected, result);
  }
}
