package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem12901Test {

  @Test
  void solution01() {

    // Given
    int a = 5;
    int b = 24;
    String expected = "TUE";

    // When
    String result = new Problem12901().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
