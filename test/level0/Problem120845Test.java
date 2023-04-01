package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120845Test {

  @Test
  void solution01() {

    // Given
    int[] box = {1, 1, 1};
    int n = 1;
    int expected = 1;

    // When
    int result = new Problem120845().solution(box, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] box = {10, 8, 6};
    int n = 3;
    int expected = 12;

    // When
    int result = new Problem120845().solution(box, n);

    // Then
    assertEquals(expected, result);
  }
}