package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120863Test {

  @Test
  void solution01() {

    // Given
    String polynomial = "3x + 7 + x";
    String expected = "4x + 7";

    // When
    String result = new Problem120863().solution(polynomial);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String polynomial = "x + x + x";
    String expected = "3x";

    // When
    String result = new Problem120863().solution(polynomial);

    // Then
    assertEquals(expected, result);
  }
}
