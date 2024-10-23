package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12917Test {

  @Test
  void solution01() {

    // Given
    String s = "Zbcdefg";
    String expected = "gfedcbZ";

    // When
    String result = new Problem12917().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
