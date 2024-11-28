package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12914Test {

  @Test
  void solution01() {

    // Given
    int n = 4;
    int expected = 5;

    // When
    long result = new Problem12914().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 3;
    int expected = 3;

    // When
    long result = new Problem12914().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
