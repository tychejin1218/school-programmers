package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem42584Test {

  @Test
  void solution01() {

    // Given
    int[] prices = {1, 2, 3, 2, 3};
    int[] expected = {4, 3, 1, 1, 0};

    // When
    int[] result = new Problem42584().solution(prices);

    // Then
    assertArrayEquals(expected, result);
  }
}