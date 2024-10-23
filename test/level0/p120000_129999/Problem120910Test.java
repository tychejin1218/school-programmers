package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120910Test {

  @Test
  void solution01() {

    // Given
    int n = 2;
    int t = 10;
    int expected = 2048;

    // When
    int result = new Problem120910().solution(n, t);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 7;
    int t = 15;
    int expected = 229376;

    // When
    int result = new Problem120910().solution(n, t);

    // Then
    assertEquals(expected, result);
  }
}
