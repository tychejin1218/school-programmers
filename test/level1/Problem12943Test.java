package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12943Test {

  @Test
  void solution01() {

    // Given
    int n = 6;
    int expected = 8;

    // When
    int result = new Problem12943().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 16;
    int expected = 4;

    // When
    int result = new Problem12943().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
