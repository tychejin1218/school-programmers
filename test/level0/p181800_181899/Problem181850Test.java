package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181850Test {

  @Test
  void solution01() {

    // Given
    double flo = 1.42;
    int expected = 1;

    // When
    int result = new Problem181850().solution(flo);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    double flo = 69.32;
    int expected = 69;

    // When
    int result = new Problem181850().solution(flo);

    // Then
    assertEquals(expected, result);
  }
}
