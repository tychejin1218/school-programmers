package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181921Test {

  @Test
  void solution01() {

    // Given
    int l = 5;
    int r = 555;
    int[] expected = {5, 50, 55, 500, 505, 550, 555};

    // When
    int[] result = new Problem181921().solution(l, r);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int l = 10;
    int r = 20;
    int[] expected = {-1};

    // When
    int[] result = new Problem181921().solution(l, r);

    // Then
    assertArrayEquals(expected, result);
  }
}
