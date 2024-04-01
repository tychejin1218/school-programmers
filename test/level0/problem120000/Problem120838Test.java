package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120838Test {

  @Test
  void solution01() {

    // Given
    String letter = ".... . .-.. .-.. ---";
    String expected = "hello";

    // When
    String result = new Problem120838().solution(letter);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String letter = ".--. -.-- - .... --- -.";
    String expected = "python";

    // When
    String result = new Problem120838().solution(letter);

    // Then
    assertEquals(expected, result);
  }
}
