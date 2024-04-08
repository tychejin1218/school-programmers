package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181859Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {0, 1, 1, 1, 0};
    int[] expected = {0, 1, 0};

    // When
    int[] result = new Problem181859().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {0, 1, 0, 1, 0};
    int[] expected = {0, 1, 0, 1, 0};

    // When
    int[] result = new Problem181859().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] arr = {0, 1, 1, 0};
    int[] expected = {-1};

    // When
    int[] result = new Problem181859().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
