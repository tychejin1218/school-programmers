package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120887Test {

  @Test
  void solution01() {

    // Given
    int i = 1;
    int j = 13;
    int k = 1;
    int expected = 6;

    // When
    int result = new Problem120887().solution(i, j, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int i = 10;
    int j = 50;
    int k = 5;
    int expected = 5;

    // When
    int result = new Problem120887().solution(i, j, k);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int i = 3;
    int j = 10;
    int k = 2;
    int expected = 0;

    // When
    int result = new Problem120887().solution(i, j, k);

    // Then
    assertEquals(expected, result);
  }
}
