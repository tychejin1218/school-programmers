package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181892Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {2, 1, 6};
    int n = 3;
    int[] expected = {6};

    // When
    int[] result = new Problem181892().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {5, 2, 1, 7, 5};
    int n = 2;
    int[] expected = {2, 1, 7, 5};

    // When
    int[] result = new Problem181892().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
