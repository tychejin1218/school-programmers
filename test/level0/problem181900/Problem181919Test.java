package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181919Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int[] expected = {10, 5, 16, 8, 4, 2, 1};

    // When
    int[] result = new Problem181919().solution(n);

    // Then
    assertArrayEquals(expected, result);
  }
}
