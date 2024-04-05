package level0.problem180000;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181854Test {

  @Test
  void solution01() {

    // Given
    int[] arr = {49, 12, 100, 276, 33};
    int n = 27;
    int[] expected = {76, 12, 127, 276, 60};

    // When
    int[] result = new Problem181854().solution(arr, n);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    int[] arr = {444, 555, 666, 777};
    int n = 100;
    int[] expected = {444, 655, 666, 877};

    // When
    int[] result = new Problem181854().solution(arr, n);

    // Then
    assertArrayEquals(expected, result);
  }
}
