package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181839Test {

  @Test
  void solution01() {

    // Given
    int a = 3;
    int b = 5;
    int expected = 34;

    // When
    int result = new Problem181839().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int a = 6;
    int b = 1;
    int expected = 14;

    // When
    int result = new Problem181839().solution(a, b);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int a = 2;
    int b = 4;
    int expected = 2;

    // When
    int result = new Problem181839().solution(a, b);

    // Then
    assertEquals(expected, result);
  }
}
