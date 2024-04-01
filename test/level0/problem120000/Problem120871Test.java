package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120871Test {

  @Test
  void solution01() {

    // Given
    int n = 10;
    int expected = 16;

    // When
    int result = new Problem120871().solution(n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 40;
    int expected = 76;

    // When
    int result = new Problem120871().solution(n);

    // Then
    assertEquals(expected, result);
  }
}
