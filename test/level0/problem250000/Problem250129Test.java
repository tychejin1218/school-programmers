package level0.problem250000;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem250129Test {

  @Test
  void solution01() {

    // Given
    String route = "NSSNEWWN";
    int[] expected = {-1, 1};

    // When
    int[] result = new Problem250129().solution(route);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String route = "EESEEWNWSNWWNS";
    int[] expected = {0, 0};

    // When
    int[] result = new Problem250129().solution(route);

    // Then
    assertArrayEquals(expected, result);
  }
}
