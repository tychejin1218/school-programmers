package level2.p80000_89999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem87390Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    long left = 2L;
    long right = 5L;
    int[] expected = {3, 2, 2, 3};

    // When
    int[] result = new Problem87390().solution(n, left, right);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 4;
    long left = 7L;
    long right = 14L;
    int[] expected = {4, 3, 3, 3, 4, 4, 4, 4};

    // When
    int[] result = new Problem87390().solution(n, left, right);

    // Then
    assertArrayEquals(expected, result);
  }
}
