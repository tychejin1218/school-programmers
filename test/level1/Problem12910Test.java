package level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12910Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {5, 9, 7, 10};
    int divisor = 5;
    int[] expected = {5, 10};

    // When
    int[] result = new Problem12910().solution(arr, divisor);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {2, 36, 1, 3};
    int divisor = 1;
    int[] expected = {1, 2, 3, 36};

    // When
    int[] result = new Problem12910().solution(arr, divisor);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] arr = {3, 2, 6};
    int divisor = 10;
    int[] expected = {-1};

    // When
    int[] result = new Problem12910().solution(arr, divisor);

    // Then
    assertArrayEquals(expected, result);
  }
}
