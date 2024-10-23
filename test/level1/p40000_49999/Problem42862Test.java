package level1.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem42862Test {

  @Test
  void solution01() {

    // Given
    int n = 5;
    int[] lost = {2, 4};
    int[] reserve = {1, 3, 5};
    int expected = 5;

    // When
    int result = new Problem42862().solution(n, lost, reserve);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int n = 5;
    int[] lost = {2, 4};
    int[] reserve = {3};
    int expected = 4;

    // When
    int result = new Problem42862().solution(n, lost, reserve);

    // Then
    assertEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int n = 3;
    int[] lost = {3};
    int[] reserve = {1};
    int expected = 2;

    // When
    int result = new Problem42862().solution(n, lost, reserve);

    // Then
    assertEquals(expected, result);
  }
}
