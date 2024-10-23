package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181917Test {

  @Test
  void solution01() {

    // Given
    boolean x1 = true;
    boolean x2 = true;
    boolean x3 = true;
    boolean x4 = true;
    boolean expected = true;

    // When
    boolean result = new Problem181917().solution(x1, x2, x3, x4);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    boolean x1 = true;
    boolean x2 = false;
    boolean x3 = false;
    boolean x4 = false;
    boolean expected = false;

    // When
    boolean result = new Problem181917().solution(x1, x2, x3, x4);

    // Then
    assertEquals(expected, result);
  }
}
