package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181931Test {

  @Test
  void solution01() {

    // Given
    int a = 3;
    int b = 4;
    boolean[] included = {true, false, false, true, true};
    int expected = 37;

    // When
    int result = new Problem181931().solution(a, b, included);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 7;
    int b = 1;
    boolean[] included = {false, false, false, true, false, false, false};
    int expected = 10;

    // When
    int result = new Problem181931().solution(a, b, included);

    // Then
    assertEquals(expected, result);
  }
}
