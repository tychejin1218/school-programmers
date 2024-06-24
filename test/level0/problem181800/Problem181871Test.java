package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181871Test {

  @Test
  void solution01() {

    // Given
    String myString = "banana";
    String pat = "ana";
    int expected = 2;

    // banana
    // ban
    // ana
    // nan
    // ana

    // When
    int result = new Problem181871().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "aaaa";
    String pat = "aa";
    int expected = 3;

    // When
    int result = new Problem181871().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }
}
