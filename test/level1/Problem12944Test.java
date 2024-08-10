package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12944Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {1, 2, 3, 4};
    double expected = 2.5;

    // When
    double result = new Problem12944().solution(arr);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {5, 5};
    double expected = 5;

    // When
    double result = new Problem12944().solution(arr);

    // Then
    assertEquals(expected, result);
  }
}