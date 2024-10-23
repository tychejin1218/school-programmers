package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181848Test {

  @Test
  void solution01() {

    // Given
    String n_str = "10";
    int expected = 10;

    // When
    int result = new Problem181848().solution(n_str);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String n_str = "8542";
    int expected = 8542;

    // When
    int result = new Problem181848().solution(n_str);

    // Then
    assertEquals(expected, result);
  }
}
