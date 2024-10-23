package level1.p170000_179999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem172928Test {

  @Test
  void solution01() {

    // Given
    String[] park = {"SOO", "OOO", "OOO"};
    String[] routes = {"E 2", "S 2", "W 1"};
    int[] expected = {2, 1};

    // When
    int[] result = new Problem172928().solution(park, routes);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String[] park = {"SOO", "OXX", "OOO"};
    String[] routes = {"E 2", "S 2", "W 1"};
    int[] expected = {0, 1};

    // When
    int[] result = new Problem172928().solution(park, routes);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String[] park = {"OSO", "OOO", "OXO", "OOO"};
    String[] routes = {"E 2", "S 3", "W 1"};
    int[] expected = {0, 0};

    // When
    int[] result = new Problem172928().solution(park, routes);

    // Then
    assertArrayEquals(expected, result);
  }
}
