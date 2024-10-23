package level1.p12000_12999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12925Test {

  @Test
  void solution01() {

    // Given
    String s = "1234";
    int expected = 1234;

    // When
    int result = new Problem12925().solution(s);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String s = "-1234";
    int expected = -1234;

    // When
    int result = new Problem12925().solution(s);

    // Then
    assertEquals(expected, result);
  }
}
