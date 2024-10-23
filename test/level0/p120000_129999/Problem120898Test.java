package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120898Test {

  @Test
  void solution01() {

    // Given
    String message = "happy birthday!";
    int expected = 30;

    // When
    int result = new Problem120898().solution(message);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String message = "I love you~";
    int expected = 22;

    // When
    int result = new Problem120898().solution(message);

    // Then
    assertEquals(expected, result);
  }
}
