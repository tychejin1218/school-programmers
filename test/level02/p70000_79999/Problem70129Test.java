package level02.p70000_79999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem70129Test {

  @Test
  void solution01() {

    // Given
    String s = "110010101001";
    int[] expected = {3, 8};

    // When
    int[] result = new Problem70129().solution(s);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "01110";
    int[] expected = {3, 3};

    // When
    int[] result = new Problem70129().solution(s);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "1111111";
    int[] expected = {4, 1};

    // When
    int[] result = new Problem70129().solution(s);

    // Then
    assertArrayEquals(expected, result);
  }
}
