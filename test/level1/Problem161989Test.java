package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem161989Test {

  @Test
  void solution01() {

    // Given
    int n = 8;
    int m = 4;
    int[] section = {2, 3, 6};
    int expected = 2;

    // When
    int result = new Problem161989().solution(n, m, section);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int m = 4;
    int[] section = {1, 3};
    int expected = 1;

    // When
    int result = new Problem161989().solution(n, m, section);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 4;
    int m = 1;
    int[] section = {1, 2, 3, 4};
    int expected = 4;

    // When
    int result = new Problem161989().solution(n, m, section);

    // Then
    assertEquals(expected, result);
  }
}
