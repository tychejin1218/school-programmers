package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181877Test {

  @Test
  void solution01() {

    // Given
    String myString = "aBcDeFg";
    String expected = "ABCDEFG";

    // When
    String result = new Problem181877().solution(myString);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "aaa";
    String expected = "AAA";

    // When
    String result = new Problem181877().solution(myString);

    // Then
    assertEquals(expected, result);
  }
}
