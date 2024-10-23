package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181882Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 3, 100, 99, 98};
    int[] expected = {2, 2, 6, 50, 99, 49};

    // When
    int[] result = new Problem181882().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
