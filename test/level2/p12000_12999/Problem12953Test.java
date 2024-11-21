package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12953Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {2, 6, 8, 14};
    int expected = 168;

    // When
    int result = new Problem12953().solution(arr);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {1, 2, 3};
    int expected = 6;

    // When
    int result = new Problem12953().solution(arr);

    // Then
    assertEquals(expected, result);
  }
}
