package level1.p130000_139999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem134240Test {

  @Test
  void solution01() {

    // Given
    int[] food = {1, 3, 4, 6};
    String expected = "1223330333221";

    // When
    String result = new Problem134240().solution(food);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] food = {1, 7, 1, 2};
    String expected = "111303111";

    // When
    String result = new Problem134240().solution(food);

    // Then
    assertEquals(expected, result);
  }
}
