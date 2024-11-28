package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12985Test {

  @Test
  void solution01() {

    // Given
    int n = 8;
    int a = 4;
    int b = 7;
    int expected = 3;

    // When
    int result = new Problem12985().solution(n, a, b);

    // Then
    assertEquals(expected, result);
  }
}
