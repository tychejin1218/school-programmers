package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120846Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int expected = 5;

    // When
    int result = new Problem120846().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 15;
    int expected = 8;

    // When
    int result = new Problem120846().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
