package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120824Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {1, 2, 3, 4, 5};
    int[] expected = {2, 3};

    // When
    int[] result = new Problem120824().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {1, 3, 5, 7};
    int[] expected = {0, 4};

    // When
    int[] result = new Problem120824().solution(num_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
