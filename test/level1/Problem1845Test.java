package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem1845Test {

  @Test
  void solution01() {

    // Given
    int[] nums = {3, 1, 2, 3};
    int expected = 2;

    // When
    int result = new Problem1845().solution(nums);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] nums = {3, 3, 3, 2, 2, 4};
    int expected = 3;

    // When
    int result = new Problem1845().solution(nums);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] nums = {3, 3, 3, 2, 2, 2};
    int expected = 2;

    // When
    int result = new Problem1845().solution(nums);

    // Then
    assertEquals(expected, result);
  }
}
