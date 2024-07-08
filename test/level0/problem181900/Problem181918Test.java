package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181918Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 4, 2, 5, 3};
    int[] expected = {1, 2, 3};

    // When
    int[] result = new Problem181918().solution(arr);

    // Then
    assertArrayEquals(expected, result);
  }
}
