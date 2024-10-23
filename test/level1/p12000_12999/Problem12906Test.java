package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12906Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 1, 3, 3, 0, 1, 1};
    int[] expected = {1, 3, 0, 1};

    // When
    int[] result = new Problem12906().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {4, 4, 4, 3, 3};
    int[] expected = {4, 3};

    // When
    int[] result = new Problem12906().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

}
