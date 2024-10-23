package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120842Test {

  @Test
  void solution01() {

    // Given
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
    int n = 2;
    int[][] expected = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

    // When
    int[][] result = new Problem120842().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
    int n = 3;
    int[][] expected = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

    // When
    int[][] result = new Problem120842().solution(num_list, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
