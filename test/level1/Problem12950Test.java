package level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem12950Test {

  @Test
  void solution01() {

    // Given
    int[][] arr1 = {{1, 2}, {2, 3}};
    int[][] arr2 = {{3, 4}, {5, 6}};
    int[][] expected = {{4, 6}, {7, 9}};

    // When
    int[][] result = new Problem12950().solution(arr1, arr2);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] arr1 = {{1}, {2}};
    int[][] arr2 = {{3}, {4}};
    int[][] expected = {{4}, {6}};

    // When
    int[][] result = new Problem12950().solution(arr1, arr2);

    // Then
    assertArrayEquals(expected, result);
  }
}
