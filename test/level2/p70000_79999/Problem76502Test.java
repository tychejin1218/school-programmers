package level2.p70000_79999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem76502Test {

  @Test
  void solution01() {

    // Given
    String s = "[](){}";
    int expected = 3;

    // When
    int result = new Problem76502().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "}]()[{";
    int expected = 2;

    // When
    int result = new Problem76502().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "[)(]";
    int expected = 0;

    // When
    int result = new Problem76502().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String s = "}}}";
    int expected = 0;

    // When
    int result = new Problem76502().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
