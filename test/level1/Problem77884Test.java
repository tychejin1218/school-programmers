package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem77884Test {

  @Test
  void solution01() {

    // Given
    int left = 13;
    int right = 17;
    int expected = 43;

    // When
    int result = new Problem77884().solution(left, right);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int left = 24;
    int right = 27;
    int expected = 52;

    // When
    int result = new Problem77884().solution(left, right);

    // Then
    assertEquals(expected, result);
  }
}
