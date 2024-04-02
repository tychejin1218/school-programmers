package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181844Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {293, 1000, 395, 678, 94};
    int[] delete_list = {94, 777, 104, 1000, 1, 12};
    int[] expected = {293, 395, 678};

    // When
    int[] result = new Problem181844().solution(arr, delete_list);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {110, 66, 439, 785, 1};
    int[] delete_list = {377, 823, 119, 43};
    int[] expected = {110, 66, 439, 785, 1};

    // When
    int[] result = new Problem181844().solution(arr, delete_list);

    // Then
    assertArrayEquals(expected, result);
  }
}
