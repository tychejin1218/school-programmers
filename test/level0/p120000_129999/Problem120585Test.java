package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120585Test {

  @Test
  void solution01() {

    // Given
    int[] array = {149, 180, 192, 170};
    int height = 167;
    int expected = 3;

    // When
    int result = new Problem120585().solution(array, height);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {180, 120, 140};
    int height = 190;
    int expected = 0;

    // When
    int result = new Problem120585().solution(array, height);

    // Then
    assertEquals(expected, result);
  }
}
