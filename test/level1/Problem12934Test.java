package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12934Test {

  @Test
  void solution01() {

    // Given
    long n = 121;
    long expected = 144;

    // When
    long result = new Problem12934().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    long n = 3;
    long expected = -1;

    // When
    long result = new Problem12934().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
