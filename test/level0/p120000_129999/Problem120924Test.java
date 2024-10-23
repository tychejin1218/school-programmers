package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120924Test {

  @Test
  void solution01() {

    // Given
    int[] common = {1, 2, 3, 4};
    int expected = 5;

    // When
    int result = new Problem120924().solution(common);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] common = {2, 4, 8};
    int expected = 16;

    // When
    int result = new Problem120924().solution(common);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] common = {2, 4, 6, 8};
    int expected = 10;

    // When
    int result = new Problem120924().solution(common);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int[] common = {3, 9, 27};
    int expected = 81;

    // When
    int result = new Problem120924().solution(common);

    // Then
    assertEquals(expected, result);
  }
}
