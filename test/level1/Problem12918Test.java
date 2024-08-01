package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12918Test {

  @Test
  void solution01() {

    // Given
    String s = "a234";
    boolean expected = false;

    // When
    boolean result = new Problem12918().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "1234";
    boolean expected = true;

    // When
    boolean result = new Problem12918().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
