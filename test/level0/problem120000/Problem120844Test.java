package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120844Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 2, 3};
    String direction = "right";
    int[] expected = {3, 1, 2};

    // When
    int[] result = new Problem120844().solution(numbers, direction);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {4, 455, 6, 4, -1, 45, 6};
    String direction = "left";
    int[] expected = {455, 6, 4, -1, 45, 6, 4};

    // When
    int[] result = new Problem120844().solution(numbers, direction);

    // Then
    assertArrayEquals(expected, result);
  }
}
