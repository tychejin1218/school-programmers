package level1.p140000_149999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem142086Test {

  @Test
  void solution01() {

    // Given
    String s = "banana";
    int[] expected = {-1, -1, -1, 2, 2, 2};

    // When
    int[] result = new Problem142086().solution(s);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "foobar";
    int[] expected = {-1, -1, 1, -1, -1, -1};

    // When
    int[] result = new Problem142086().solution(s);

    // Then
    assertArrayEquals(expected, result);
  }
}
