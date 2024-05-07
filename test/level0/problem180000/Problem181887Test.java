package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181887Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {4, 2, 6, 1, 7, 6};
    int expected = 17;

    // When
    int result = new Problem181887().solution(num_list);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {-1, 2, 5, 6, 3};
    int expected = 8;

    // When
    int result = new Problem181887().solution(num_list);

    // Then
    assertEquals(expected, result);
  }
}
