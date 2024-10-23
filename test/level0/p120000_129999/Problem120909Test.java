package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120909Test {

  @Test
  void solution01() {

    // Given
    int n = 144;
    int expected = 1;

    // When
    int result = new Problem120909().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 976;
    int expected = 2;

    // When
    int result = new Problem120909().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
