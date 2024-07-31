package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12912Test {

  @Test
  void solution01() {

    // Given
    int a = 3;
    int b = 5;
    int expected = 12;

    // When
    long result = new Problem12912().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 3;
    int b = 3;
    int expected = 3;

    // When
    long result = new Problem12912().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int a = 5;
    int b = 3;
    int expected = 12;

    // When
    long result = new Problem12912().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
