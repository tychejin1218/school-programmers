package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120878Test {

  @Test
  void solution01() {

    // Given
    int a = 7;
    int b = 20;
    int expected = 1;

    // When
    int result = new Problem120878().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 11;
    int b = 22;
    int expected = 1;

    // When
    int result = new Problem120878().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int a = 12;
    int b = 21;
    int expected = 2;

    // When
    int result = new Problem120878().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
