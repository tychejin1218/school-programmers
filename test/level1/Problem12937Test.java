package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12937Test {

  @Test
  void solution01() {

    // Given
    int num = 3;
    String expected = "Odd";

    // When
    String result = new Problem12937().solution(num);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num = 4;
    String expected = "Even";

    // When
    String result = new Problem12937().solution(num);

    // Then
    assertEquals(expected, result);
  }
}
