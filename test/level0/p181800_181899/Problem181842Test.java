package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181842Test {

  @Test
  void solution01() {

    // Given
    String str1 = "abc";
    String str2 = "aabcc";
    int expected = 1;

    // When
    int result = new Problem181842().solution(str1, str2);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String str1 = "tbt";
    String str2 = "tbbttb";
    int expected = 0;

    // When
    int result = new Problem181842().solution(str1, str2);

    // Then
    assertEquals(expected, result);
  }
}
