package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120886Test {

  @Test
  void solution01() {

    // Given
    String before = "olleh";
    String after = "hello";
    int expected = 1;

    // When
    int result = new Problem120886().solution(before, after);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String before = "allpe";
    String after = "apple";
    int expected = 0;

    // When
    int result = new Problem120886().solution(before, after);

    // Then
    assertEquals(expected, result);
  }
}
