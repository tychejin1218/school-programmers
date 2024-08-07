package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem12931Test {

  @Test
  void solution01() {

    // Given
    int n = 123;
    int expected = 6;

    // When
    int result = new Problem12931().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 987;
    int expected = 24;

    // When
    int result = new Problem12931().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
