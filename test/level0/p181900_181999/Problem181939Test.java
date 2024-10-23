package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181939Test {

  @Test
  void solution01() {

    // Given
    int a = 9;
    int b = 91;
    int expected = 991;

    // When
    int result = new Problem181939().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 89;
    int b = 8;
    int expected = 898;

    // When
    int result = new Problem181939().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
