package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120853Test {

  @Test
  void solution01() {

    // Given
    String s = "1 2 Z 3";
    int expected = 4;

    // When
    int result = new Problem120853().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "10 20 30 40";
    int expected = 100;

    // When
    int result = new Problem120853().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "10 Z 20 Z 1";
    int expected = 1;

    // When
    int result = new Problem120853().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String s = "10 Z 20 Z";
    int expected = 0;

    // When
    int result = new Problem120853().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    String s = "-1 -2 -3 Z";
    int expected = -3;

    // When
    int result = new Problem120853().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
