package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120922Test {

  @Test
  void solution01() {

    // Given
    int M = 2;
    int N = 2;
    int expected = 3;

    // When
    int result = new Problem120922().solution(M, N);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int M = 2;
    int N = 5;
    int expected = 9;

    // When
    int result = new Problem120922().solution(M, N);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int M = 1;
    int N = 1;
    int expected = 0;

    // When
    int result = new Problem120922().solution(M, N);

    // Then
    assertEquals(expected, result);
  }
}
