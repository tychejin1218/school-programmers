package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120902Test {

  @Test
  void solution01() {

    // Given
    String my_string = "3 + 4";
    int expected = 7;

    // When
    int result = new Problem120902().solution(my_string);

    // Then
    assertEquals(expected, result);
  }
}
