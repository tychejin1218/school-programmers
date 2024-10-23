package level1.p130000_139999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem136798Test {

  @Test
  void solution01() {

    // Given
    int number = 5;
    int limit = 3;
    int power = 2;
    int expected = 10;

    // When
    int result = new Problem136798().solution(number, limit, power);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int number = 10;
    int limit = 3;
    int power = 2;
    int expected = 21;

    // When
    int result = new Problem136798().solution(number, limit, power);

    // Then
    assertEquals(expected, result);
  }
}
