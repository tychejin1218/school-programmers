package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181879Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
    int expected = 51;

    // When
    int result = new Problem181879().solution(num_list);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {2, 3, 4, 5};
    int expected = 120;

    // When
    int result = new Problem181879().solution(num_list);

    // Then
    assertEquals(expected, result);
  }
}
