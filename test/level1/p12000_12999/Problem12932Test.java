package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12932Test {

  @Test
  void solution01() {

    // Given
    long n = 12345L;
    int[] expected = {5, 4, 3, 2, 1};

    // When
    int[] result = new Problem12932().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    long n = 12354L;
    int[] expected = {4, 5, 3, 2, 1};

    // When
    int[] result = new Problem12932().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
