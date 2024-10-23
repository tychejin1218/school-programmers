package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120821Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {1, 2, 3, 4, 5};
    int[] expected = {5, 4, 3, 2, 1};

    // When
    int[] result = new Problem120821().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {1, 1, 1, 1, 1, 2};
    int[] expected = {2, 1, 1, 1, 1, 1};

    // When
    int[] result = new Problem120821().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] num_list = {1, 0, 1, 1, 1, 3, 5};
    int[] expected = {5, 3, 1, 1, 1, 0, 1};

    // When
    int[] result = new Problem120821().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
