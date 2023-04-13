package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120864Test {

  @Test
  void solution01() {

    // Given
    String my_string = "aAb1B2cC34oOp";
    int expected = 37;

    // When
    int result = new Problem120864().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "1a2b3c4d123Z";
    int expected = 133;

    // When
    int result = new Problem120864().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
