package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181889Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {2, 1, 6};
    int n = 1;
    int[] expected = {2};

    // When
    int[] result = new Problem181889().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {5, 2, 1, 7, 5};
    int n = 3;
    int[] expected = {5, 2, 1};

    // When
    int[] result = new Problem181889().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }

}
