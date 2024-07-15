package level0.problem181900;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181925Test {

  @Test
  void solution01() {

    // Given
    int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
    String expected = "wsdawsdassw";

    // When
    String result = new Problem181925().solution(numLog);

    // Then
    assertEquals(expected, result);
  }
}
