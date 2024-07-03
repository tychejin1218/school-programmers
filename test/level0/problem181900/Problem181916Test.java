package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181916Test {

  @Test
  void solution01() {

    // Given
    int a = 2;
    int b = 2;
    int c = 2;
    int d = 2;
    int expected = 2222;

    // When
    int result = new Problem181916().solution(a, b, c, d);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 4;
    int b = 1;
    int c = 4;
    int d = 4;
    int expected = 1681;

    // When
    int result = new Problem181916().solution(a, b, c, d);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int a = 6;
    int b = 3;
    int c = 3;
    int d = 6;
    int expected = 27;

    // When
    int result = new Problem181916().solution(a, b, c, d);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int a = 2;
    int b = 5;
    int c = 2;
    int d = 6;
    int expected = 30;

    // When
    int result = new Problem181916().solution(a, b, c, d);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution05() {

    // Given
    int a = 6;
    int b = 4;
    int c = 2;
    int d = 5;
    int expected = 2;

    // When
    int result = new Problem181916().solution(a, b, c, d);

    // Then
    assertEquals(expected, result);
  }
}
