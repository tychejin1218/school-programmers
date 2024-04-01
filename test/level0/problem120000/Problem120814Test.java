package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120814Test {

  @Test
  void solution01() {

    // Given
    int n = 7;
    int expected = 1;

    // When
    int result = new Problem120814().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 1;
    int expected = 1;

    // When
    int result = new Problem120814().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 15;
    int expected = 3;

    // When
    int result = new Problem120814().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
