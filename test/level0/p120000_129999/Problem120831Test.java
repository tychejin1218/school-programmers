package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120831Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int expected = 30;

    // When
    int result = new Problem120831().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 4;
    int expected = 6;

    // When
    int result = new Problem120831().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
