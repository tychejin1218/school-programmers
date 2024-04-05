package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181853Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {12, 4, 15, 46, 38, 1, 14};
    int[] expected = {1, 4, 12, 14, 15};

    // When
    int[] result = new Problem181853().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
