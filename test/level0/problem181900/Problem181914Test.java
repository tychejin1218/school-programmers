package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181914Test {

  @Test
  void solution01() {

    // Given
    String number = "123";
    int expected = 6;

    // When
    int result = new Problem181914().solution(number);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String number = "78720646226947352489";
    int expected = 2;

    // When
    int result = new Problem181914().solution(number);

    // Then
    assertEquals(expected, result);
  }
}
