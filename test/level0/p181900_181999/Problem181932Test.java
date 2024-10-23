package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181932Test {

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
