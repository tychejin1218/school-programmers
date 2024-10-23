package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181872Test {

  @Test
  void solution01() {

    // Given
    String myString = "AbCdEFG";
    String pat = "dE";
    String expected = "AbCdE";

    // When
    String result = new Problem181872().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "AAAAaaaa";
    String pat = "a";
    String expected = "AAAAaaaa";

    // When
    String result = new Problem181872().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }
}
