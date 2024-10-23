package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120860Test {

  @Test
  void solution01() {

    // Given
    int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
    int expected = 1;

    // When
    int result = new Problem120860().solution(dots);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
    int expected = 4;

    // When
    int result = new Problem120860().solution(dots);

    // Then
    assertEquals(expected, result);
  }
}
