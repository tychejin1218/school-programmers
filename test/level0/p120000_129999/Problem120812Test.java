package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120812Test {

  @Test
  void solution01() {

    // Given
    int[] array = {1, 2, 3, 3, 3, 4};
    int expected = 3;

    // When
    int result = new Problem120812().solution(array);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {1, 1, 2, 2};
    int expected = -1;

    // When
    int result = new Problem120812().solution(array);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] array = {1};
    int expected = 1;

    // When
    int result = new Problem120812().solution(array);

    // Then
    assertEquals(expected, result);
  }

}
