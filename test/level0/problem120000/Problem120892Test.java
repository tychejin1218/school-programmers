package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120892Test {

  @Test
  void solution01() {

    // Given
    String cipher = "dfjardstddetckdaccccdegk";
    int code = 4;
    String expected = "attack";

    // When
    String result = new Problem120892().solution(cipher, code);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String cipher = "pfqallllabwaoclk";
    int code = 2;
    String expected = "fallback";

    // When
    String result = new Problem120892().solution(cipher, code);

    // Then
    assertEquals(expected, result);
  }
}
