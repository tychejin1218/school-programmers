package level0.p120000_129999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120923Test {

  @Test
  void solution01() {

    // Given
    int num = 3;
    int total = 12;
    int[] expected = {3, 4, 5};

    // When
    int[] result = new Problem120923().solution(num, total);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int num = 5;
    int total = 15;
    int[] expected = {1, 2, 3, 4, 5};

    // When
    int[] result = new Problem120923().solution(num, total);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution03() {

    // Given
    int num = 4;
    int total = 14;
    int[] expected = {2, 3, 4, 5};

    // When
    int[] result = new Problem120923().solution(num, total);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution04() {

    // Given
    int num = 5;
    int total = 5;
    int[] expected = {-1, 0, 1, 2, 3};

    // When
    int[] result = new Problem120923().solution(num, total);

    // Then
    assertArrayEquals(expected, result);
  }

}
