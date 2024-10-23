package level1.p40000_49999;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem42840Test {

  @Test
  void solution01() {

    // Given
    int[] answers = {1, 2, 3, 4, 5};
    int[] expected = {1};

    // When
    int[] result = new Problem42840().solution(answers);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] answers = {1, 3, 2, 4, 2};
    int[] expected = {1, 2, 3};

    // When
    int[] result = new Problem42840().solution(answers);

    // Then
    assertArrayEquals(expected, result);
  }
}
