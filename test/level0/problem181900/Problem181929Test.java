package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181929Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {3, 4, 5, 2, 1};
    int expected = 1;

    // When
    int result = new Problem181929().solution(num_list);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {5, 7, 8, 3};
    int expected = 0;

    // When
    int result = new Problem181929().solution(num_list);

    // Then
    assertEquals(expected, result);
  }
}
