package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181888Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {4, 2, 6, 1, 7, 6};
    int n = 2;
    int[] expected = {4, 6, 7};

    // When
    int[] result = new Problem181888().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {4, 2, 6, 1, 7, 6};
    int n = 4;
    int[] expected = {4, 7};

    // When
    int[] result = new Problem181888().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
