package level1.p60000_69999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem67256Test {

  @Test
  void solution01() {

    // Given
    int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    String hand = "right";
    String expected = "LRLLLRLLRRL";

    // When
    String result = new Problem67256().solution(numbers, hand);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    String hand = "left";
    String expected = "LRLLRRLLLRR";

    // When
    String result = new Problem67256().solution(numbers, hand);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    String hand = "right";
    String expected = "LLRLLRLLRL";

    // When
    String result = new Problem67256().solution(numbers, hand);

    // Then
    assertEquals(expected, result);
  }
}
