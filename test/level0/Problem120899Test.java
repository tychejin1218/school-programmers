package level0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem120899Test {

  @Test
  void solution01() {

    // Given
    int[] array = {1, 8, 3};
    int[] expected = {8, 1};

    // When
    int[] result = new Problem120899().solution(array);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] array = {9, 10, 11, 8};
    int[] expected = {11, 2};

    // When
    int[] result = new Problem120899().solution(array);

    // Then
    assertArrayEquals(expected, result);
  }

}
