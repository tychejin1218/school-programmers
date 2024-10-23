package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120826Test {

  @Test
  void solution01() {

    // Given
    String my_string = "abcdef";
    String letter = "f";
    String expected = "abcde";

    // When
    String result = new Problem120826().solution(my_string, letter);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "BCBdbe";
    String letter = "B";
    String expected = "Cdbe";

    // When
    String result = new Problem120826().solution(my_string, letter);

    // Then
    assertEquals(expected, result);
  }
}
