package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120815Test {

  @Test
  void solution01() {

    // Given
    int n = 6;
    int expected = 1;

    // When
    int result = new Problem120815().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 10;
    int expected = 5;

    // When
    int result = new Problem120815().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 4;
    int expected = 2;

    // When
    int result = new Problem120815().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
