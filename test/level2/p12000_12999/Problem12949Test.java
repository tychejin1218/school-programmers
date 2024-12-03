package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12949Test {

  @Test
  void solution01() {

    // Given
    int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
    int[][] arr2 = {{3, 3}, {3, 3}};
    int[][] expected = {{15, 15}, {15, 15}, {15, 15}};

    // When
    int[][] result = new Problem12949().solution(arr1, arr2);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
    int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
    int[][] expected = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};

    // When
    int[][] result = new Problem12949().solution(arr1, arr2);

    // Then
    assertArrayEquals(expected, result);
  }
}
