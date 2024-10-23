package level0.p181800_181899;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181860Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {3, 2, 4, 1, 3};
    boolean[] flag = {true, false, true, false, false};
    int[] expected = {3, 3, 3, 3, 4, 4, 4, 4};

    // When
    int[] result = new Problem181860().solution(arr, flag);

    // Then
    assertArrayEquals(expected, result);
  }
}
