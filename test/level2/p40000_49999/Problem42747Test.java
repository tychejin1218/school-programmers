package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42747Test {

  @Test
  void solution01() {

    // Given
    int[] citations = {3, 0, 6, 1, 5};
    int expected = 3;

    // When
    int result = new Problem42747().solution(citations);

    // Then
    assertEquals(expected, result);
  }
}
