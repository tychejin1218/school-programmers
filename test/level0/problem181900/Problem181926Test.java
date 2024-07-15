package level0.problem181900;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181926Test {

  @Test
  void solution01() {

    // Given
    int n = 0;
    String control = "wsdawsdassw";
    int expected = -1;

    // When
    int result = new Problem181926().solution(0, control);

    // Then
    assertEquals(expected, result);
  }
}
