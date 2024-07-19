package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181931Test {

  @Test
  void solution01() {

    // Given
    String code = "abc1abc1abc";
    String expected = "acbac";

    // When
    String result = new Problem181932().solution(code);

    // Then
    assertEquals(expected, result);
  }
}

