package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12916Test {

  @Test
  void solution01() {

    // Given
    String s = "pPoooyY";
    boolean expected = true;

    // When
    boolean result = new Problem12916().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "Pyy";
    boolean expected = false;

    // When
    boolean result = new Problem12916().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
