package level0.problem180000;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181899Test {

  @Test
  void solution01() {

    // Given
    int start_num = 10;
    int end_num = 3;
    int[] expected = {10, 9, 8, 7, 6, 5, 4, 3};

    // When
    int[] result = new Problem181899().solution(start_num, end_num);

    // Then
    assertArrayEquals(expected, result);
  }
}
