package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181861Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {5, 1, 4};
    int[] expected = {5, 5, 5, 5, 5, 1, 4, 4, 4, 4};

    // When
    int[] result = new Problem181861().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {6, 6};
    int[] expected = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};

    // When
    int[] result = new Problem181861().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] arr = {1};
    int[] expected = {1};

    // When
    int[] result = new Problem181861().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
