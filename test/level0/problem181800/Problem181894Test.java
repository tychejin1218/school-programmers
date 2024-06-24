package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181894Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 1, 4, 5, 2, 9};
    int[] expected = {2, 1, 4, 5, 2};

    // When
    int[] result = new Problem181894().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {1, 2, 1};
    int[] expected = {2};

    // When
    int[] result = new Problem181894().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] arr = {1, 1, 1};
    int[] expected = {-1};

    // When
    int[] result = new Problem181894().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
    int[] expected = {2, 1, 2, 1, 10, 2};

    // When
    int[] result = new Problem181894().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
