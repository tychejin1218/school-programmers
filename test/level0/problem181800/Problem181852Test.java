package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181852Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
    int[] expected = {15, 32, 38, 46, 56};

    // When
    int[] result = new Problem181852().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }

}
