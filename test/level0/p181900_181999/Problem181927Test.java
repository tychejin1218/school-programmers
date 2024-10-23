package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181927Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {2, 1, 6};
    int[] expected = {2, 1, 6, 5};

    // When
    int[] result = new Problem181927().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {5, 2, 1, 7, 5};
    int[] expected = {5, 2, 1, 7, 5, 10};

    // When
    int[] result = new Problem181927().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
