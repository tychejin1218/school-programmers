package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181901Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int k = 3;
    int[] expected = {3, 6, 9};

    // When
    int[] result = new Problem181901().solution(n, k);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 15;
    int k = 5;
    int[] expected = {5, 10, 15};

    // When
    int[] result = new Problem181901().solution(n, k);

    // Then
    assertArrayEquals(expected, result);
  }
}
