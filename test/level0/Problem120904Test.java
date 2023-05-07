package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120904Test {

  @Test
  void solution01() {

    // Given
    int num = 29183;
    int k = 1;
    int expected = 2;

    // When
    int result = new Problem120904().solution(num, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num = 232443;
    int k = 4;
    int expected = 4;

    // When
    int result = new Problem120904().solution(num, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int num = 123456;
    int k = 7;
    int expected = -1;

    // When
    int result = new Problem120904().solution(num, k);

    // Then
    assertEquals(expected, result);
  }
}