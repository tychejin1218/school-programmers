package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12926Test {

  @Test
  void solution01() {

    // Given
    String s = "AB";
    int n = 1;
    String expected = "BC";

    // When
    String result = new Problem12926().solution(s, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "z";
    int n = 1;
    String expected = "a";

    // When
    String result = new Problem12926().solution(s, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "a B z";
    int n = 4;
    String expected = "e F d";

    // When
    String result = new Problem12926().solution(s, n);

    // Then
    assertEquals(expected, result);
  }
}
