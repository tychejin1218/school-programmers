package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181880Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {12, 4, 15, 1, 14};
    int expected = 11;

    // When
    int result = new Problem181880().solution(num_list);

    // Then
    assertEquals(expected, result);
  }
}
