package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181896Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {12, 4, 15, 46, 38, -2, 15};
    int expected = 5;

    // When
    int result = new Problem181896().solution(num_list);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {13, 22, 53, 24, 15, 6};
    int expected = -1;

    // When
    int result = new Problem181896().solution(num_list);

    // Then
    assertEquals(expected, result);
  }
}
