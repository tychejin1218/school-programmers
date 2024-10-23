package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181851Test {

  @Test
  void solution01() {

    // Given
    int[] rank = {3, 7, 2, 5, 4, 6, 1};
    boolean[] attendance = {false, true, true, true, true, false, false};
    int expected = 20403;

    // When
    int result = new Problem181851().solution(rank, attendance);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] rank = {1, 2, 3};
    boolean[] attendance = {true, true, true};
    int expected = 102;

    // When
    int result = new Problem181851().solution(rank, attendance);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] rank = {6, 1, 5, 2, 3, 4};
    boolean[] attendance = {true, false, true, false, false, true};
    int expected = 50200;

    // When
    int result = new Problem181851().solution(rank, attendance);

    // Then
    assertEquals(expected, result);
  }
}
