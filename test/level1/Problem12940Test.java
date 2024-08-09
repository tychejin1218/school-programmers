package level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12940Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    int m = 12;
    int[] expected = {3, 12};

    // When
    int[] result = new Problem12940().solution(n, m);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 2;
    int m = 5;
    int[] expected = {1, 10};

    // When
    int[] result = new Problem12940().solution(n, m);

    // Then
    assertArrayEquals(expected, result);
  }
}
