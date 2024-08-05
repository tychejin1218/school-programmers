package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12922Test {

  @Test
  void solution01() {

    // Given
    int n = 3;
    String expected = "수박수";

    // When
    String result = new Problem12922().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 4;
    String expected = "수박수박";

    // When
    String result = new Problem12922().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
