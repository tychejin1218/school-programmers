package level2.p80000_89999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem86971Test {

  @Test
  void solution01() {

    // Given
    int n = 9;
    int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
    int expected = 3;

    // When
    int result = new Problem86971().solution(n, wires);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 4;
    int[][] wires = {{1, 2}, {2, 3}, {3, 4}};
    int expected = 0;

    // When
    int result = new Problem86971().solution(n, wires);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 7;
    int[][] wires = {{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}};
    int expected = 1;

    // When
    int result = new Problem86971().solution(n, wires);

    // Then
    assertEquals(expected, result);
  }
}
