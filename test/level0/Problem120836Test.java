package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120836Test {

  @Test
  void solution01() {

    // Given
    int n = 20;
    int expected = 6;

    // When
    int result = new Problem120836().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 100;
    int expected = 9;

    // When
    int result = new Problem120836().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
