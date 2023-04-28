package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120893Test {

  @Test
  void solution01() {

    // Given
    String my_string = "cccCCC";
    String expected = "CCCccc";

    // When
    String result = new Problem120893().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "abCdEfghIJ";
    String expected = "ABcDeFGHij";

    // When
    String result = new Problem120893().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
