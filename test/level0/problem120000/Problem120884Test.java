package level0.problem120000;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem120884Test {

  @Test
  void solution01() {

    // Given
    int chicken = 100;
    int expected = 11;

    // When
    int result = new Problem120884().solution(chicken);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int chicken = 1081;
    int expected = 120;

    // When
    int result = new Problem120884().solution(chicken);

    // Then
    assertEquals(expected, result);
  }
}
