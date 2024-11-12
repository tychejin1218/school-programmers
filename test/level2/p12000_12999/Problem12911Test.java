package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12911Test {

  @Test
  void solution01() {

    // Given
    int n = 78;
    int expected = 83;

    // When
    int result = new Problem12911().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 15;
    int expected = 23;

    // When
    int result = new Problem12911().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
