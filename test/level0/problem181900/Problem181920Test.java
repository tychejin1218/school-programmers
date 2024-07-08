package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181920Test {

  @Test
  void solution01() {

    // Given
    int start_num = 3;
    int end_num = 10;
    int[] expected = {3, 4, 5, 6, 7, 8, 9, 10};

    // When
    int[] result = new Problem181920().solution(start_num, end_num);

    // Then
    assertArrayEquals(expected, result);
  }
}
