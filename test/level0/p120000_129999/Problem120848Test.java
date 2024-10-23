package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120848Test {

  @Test
  void solution01() {

    // Given
    int n = 3628800;
    int expected = 10;

    // When
    int result = new Problem120848().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 7;
    int expected = 3;

    // When
    int result = new Problem120848().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
