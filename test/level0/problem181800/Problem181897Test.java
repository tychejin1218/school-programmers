package level0.problem181800;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181897Test {

  @Test
  void solution01() {

    // Given
    int n = 1;
    int[] slicer = {1, 5, 2};
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] expected = {1, 2, 3, 4, 5, 6};

    // When
    int[] result = new Problem181897().solution(n, slicer, num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 2;
    int[] slicer = {1, 5, 2};
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] expected = {2, 3, 4, 5, 6, 7, 8, 9};

    // When
    int[] result = new Problem181897().solution(n, slicer, num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 3;
    int[] slicer = {1, 5, 2};
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] expected = {2, 3, 4, 5, 6};

    // When
    int[] result = new Problem181897().solution(n, slicer, num_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int n = 4;
    int[] slicer = {1, 5, 2};
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] expected = {2, 4, 6};

    // When
    int[] result = new Problem181897().solution(n, slicer, num_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
