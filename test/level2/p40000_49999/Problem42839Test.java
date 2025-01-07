package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42839Test {

  @Test
  void solution01() {

    // Given
    String numbers = "17";
    int expected = 3;

    // When
    int result = new Problem42839().solution(numbers);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String numbers = "011";
    int expected = 2;

    // When
    int result = new Problem42839().solution(numbers);

    // Then
    assertEquals(expected, result);
  }
}
