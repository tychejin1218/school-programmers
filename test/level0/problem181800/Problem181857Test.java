package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181857Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 3, 4, 5, 6};
    int[] expected = {1, 2, 3, 4, 5, 6, 0, 0};

    // When
    int[] result = new Problem181857().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {58, 172, 746, 89};
    int[] expected = {58, 172, 746, 89};

    // When
    int[] result = new Problem181857().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
