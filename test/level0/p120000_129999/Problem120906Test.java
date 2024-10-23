package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120906Test {

  @Test
  void solution01() {

    // Given
    int n = 1234;
    int expected = 10;

    // When
    int result = new Problem120906().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 930211;
    int expected = 16;

    // When
    int result = new Problem120906().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
