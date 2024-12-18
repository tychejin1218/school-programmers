package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120868Test {

  @Test
  void solution01() {

    // Given
    int[] sides = {1, 2};
    int expected = 1;

    // When
    int result = new Problem120868().solution(sides);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] sides = {3, 6};
    int expected = 5;

    // When
    int result = new Problem120868().solution(sides);

    // Then
    assertEquals(expected, result);
  }
}
