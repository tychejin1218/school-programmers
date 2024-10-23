package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181878Test {

  @Test
  void solution01() {

    // Given
    String myString = "AbCdEfG";
    String pat = "aBc";
    int expected = 1;

    // When
    int result = new Problem181878().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "aaAA";
    String pat = "aaaaa";
    int expected = 0;

    // When
    int result = new Problem181878().solution(myString, pat);

    // Then
    assertEquals(expected, result);
  }
}
