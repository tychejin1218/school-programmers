package level02.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12909Test {

  @Test
  void solution01() {

    // Given
    String s = "()()";
    boolean expected = true;

    // When
    boolean result = new Problem12909().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "(())()";
    boolean expected = true;

    // When
    boolean result = new Problem12909().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = ")()(";
    boolean expected = false;

    // When
    boolean result = new Problem12909().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    String s = "(()(";
    boolean expected = false;

    // When
    boolean result = new Problem12909().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
