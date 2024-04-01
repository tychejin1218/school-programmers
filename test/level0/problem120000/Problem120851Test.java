package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120851Test {

  @Test
  void solution01() {

    // Given
    String my_string = "aAb1B2cC34oOp";
    int expected = 10;

    // When
    int result = new Problem120851().solution(my_string);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String my_string = "1a2b3c4d123";
    int expected = 16;

    // When
    int result = new Problem120851().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
