package level0.problem120000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120816Test {

  @Test
  void solution01() {

    // Given
    int slice = 7;
    int n = 10;
    int expected = 2;

    // When
    int result = new Problem120816().solution(slice, n);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int slice = 4;
    int n = 12;
    int expected = 3;

    // When
    int result = new Problem120816().solution(slice, n);

    // Then
    assertEquals(expected, result);
  }
}
