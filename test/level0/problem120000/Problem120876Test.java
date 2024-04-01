package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120876Test {

  @Test
  void solution01() {

    // Given
    int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
    int expected = 2;

    // When
    int result = new Problem120876().solution(lines);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
    int expected = 0;

    // When
    int result = new Problem120876().solution(lines);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
    int expected = 8;

    // When
    int result = new Problem120876().solution(lines);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int[][] lines = {{-100, 100}, {-100, 100}, {-100, 100}};
    int expected = 200;

    // When
    int result = new Problem120876().solution(lines);

    // Then
    assertEquals(expected, result);
  }
}
