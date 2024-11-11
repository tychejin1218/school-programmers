package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12924Test {

  @Test
  void solution01() {

    // Given
    int n = 15;
    int expected = 4;

    // When
    int result = new Problem12924().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
