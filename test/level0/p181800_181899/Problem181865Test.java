package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181865Test {

  @Test
  void solution01() {

    // Given
    String binomial = "43 + 12";
    int expected = 55;

    // When
    int result = new Problem181865().solution(binomial);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String binomial = "0 - 7777";
    int expected = -7777;

    // When
    int result = new Problem181865().solution(binomial);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String binomial = "40000 * 40000";
    int expected = 1600000000;

    // When
    int result = new Problem181865().solution(binomial);

    // Then
    assertEquals(expected, result);
  }
}
