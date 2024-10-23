package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181938Test {

  @Test
  void solution01() {

    // Given
    int a = 2;
    int b = 91;
    int expected = 364;

    // When
    int result = new Problem181938().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 91;
    int b = 2;
    int expected = 912;

    // When
    int result = new Problem181938().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
