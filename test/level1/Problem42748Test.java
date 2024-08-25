package level1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem42748Test {

  @Test
  void solution01() {

    // Given
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    int[] expected = {5, 6, 3};

    // When
    int[] result = new Problem42748().solution(array, commands);

    // Then
    assertArrayEquals(expected, result);
  }
}