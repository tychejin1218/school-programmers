package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120896Test {

  @Test
  void solution01() {

    // Given
    String s = "abcabcadc";
    String expected = "d";

    // When
    String result = new Problem120896().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "abdc";
    String expected = "abcd";

    // When
    String result = new Problem120896().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "hello";
    String expected = "eho";

    // When
    String result = new Problem120896().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
