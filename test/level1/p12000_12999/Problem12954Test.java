package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12954Test {

  @Test
  void solution01() {

    // Given
    int x = 2;
    int n = 5;
    long[] expected = {2, 4, 6, 8, 10};

    // When
    long[] result = new Problem12954().solution(x, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int x = 4;
    int n = 3;
    long[] expected = {4, 8, 12};

    // When
    long[] result = new Problem12954().solution(x, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int x = -4;
    int n = 2;
    long[] expected = {-4, -8};

    // When
    long[] result = new Problem12954().solution(x, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
