package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181928Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {3, 4, 5, 2, 1};
    int expected = 393;

    // When
    int result = new Problem181928().solution(num_list);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {5, 7, 8, 3};
    int expected = 581;

    // When
    int result = new Problem181928().solution(num_list);

    // Then
    assertEquals(expected, result);
  }
}
