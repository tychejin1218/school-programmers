package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12977Test {

  @Test
  void solution01() {

    // Given
    int[] nums = {1, 2, 3, 4};
    int expected = 1;

    // When
    int result = new Problem12977().solution(nums);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] nums = {1, 2, 7, 6, 4};
    int expected = 4;

    // When
    int result = new Problem12977().solution(nums);

    // Then
    assertEquals(expected, result);
  }
}
