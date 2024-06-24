package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181856Test {

  @Test
  void solution01() {

    // Given
    int[] arr1 = {49, 13};
    int[] arr2 = {70, 11, 2};
    int expected = -1;

    // When
    int result = new Problem181856().solution(arr1, arr2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr1 = {100, 17, 84, 1};
    int[] arr2 = {55, 12, 65, 36};
    int expected = 1;

    // When
    int result = new Problem181856().solution(arr1, arr2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {3, 3, 3, 3, 3};
    int expected = 0;

    // When
    int result = new Problem181856().solution(arr1, arr2);

    // Then
    assertEquals(expected, result);
  }
}
