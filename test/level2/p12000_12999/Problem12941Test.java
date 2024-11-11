package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12941Test {

  @Test
  void solution01() {

    // Given
    int[] A = {1, 4, 2};
    int[] B = {5, 4, 4};
    int expected = 29;

    // When
    int result = new Problem12941().solution(A, B);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] A = {1, 2};
    int[] B = {3, 4};
    int expected = 10;

    // When
    int result = new Problem12941().solution(A, B);

    // Then
    assertEquals(expected, result);
  }
}
