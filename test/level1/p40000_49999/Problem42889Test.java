package level1.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem42889Test {

  @Test
  void solution01() {

    // Given
    int N = 5;
    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
    int[] expected = {3, 4, 2, 1, 5};

    // When
    int[] result = new Problem42889().solution(N, stages);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int N = 4;
    int[] stages = {4, 4, 4, 4, 4};
    int[] expected = {4, 1, 2, 3};

    // When
    int[] result = new Problem42889().solution(N, stages);

    // Then
    assertArrayEquals(expected, result);
  }
}
