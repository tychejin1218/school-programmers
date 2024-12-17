package level2.p40000_49999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem42586Test {

  @Test
  void solution01() {

    // Given
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    int[] expected = {2, 1};

    // When
    int[] result = new Problem42586().solution(progresses, speeds);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] progresses = {95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};
    int[] expected = {1, 3, 2};

    // When
    int[] result = new Problem42586().solution(progresses, speeds);

    // Then
    assertArrayEquals(expected, result);
  }
}
