package level0.problem181800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem181867Test {

  @Test
  void solution01() {

    // Given
    String myString = "oxooxoxxox";
    int[] expected = {1, 2, 1, 0, 1, 0};

    // When
    int[] result = new Problem181867().solution(myString);

    // Then
    assertArrayEquals(expected, result);
  }

  @Test
  void solution02() {

    // Given
    String myString = "xabcxdefxghi";
    int[] expected = {0, 3, 3, 3};

    // When
    int[] result = new Problem181867().solution(myString);

    // Then
    assertArrayEquals(expected, result);
  }
}
