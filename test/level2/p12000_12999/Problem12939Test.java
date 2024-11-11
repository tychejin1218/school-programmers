package level2.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12939Test {

  @Test
  void solution01() {

    // Given
    String s = "1 2 3 4";
    String expected = "1 4";

    // When
    String result = new Problem12939().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "-1 -2 -3 -4";
    String expected = "-4 -1";

    // When
    String result = new Problem12939().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    String s = "-1 -1";
    String expected = "-1 -1";

    // When
    String result = new Problem12939().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
