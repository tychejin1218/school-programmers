package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181840Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {1, 2, 3, 4, 5};
    int n = 3;
    int expected = 1;

    // When
    int result = new Problem181840().solution(num_list, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {15, 98, 23, 2, 15};
    int n = 20;
    int expected = 0;

    // When
    int result = new Problem181840().solution(num_list, n);

    // Then
    assertEquals(expected, result);
  }
}
