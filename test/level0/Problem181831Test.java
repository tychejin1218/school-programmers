package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181831Test {

  @Test
  void solution01() {

    // Given
    int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
    int expected = 1;

    // When
    int result = new Problem181831().solution(arr);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
    int expected = 0;

    // When
    int result = new Problem181831().solution(arr);

    // Then
    assertEquals(expected, result);
  }
}
