package level0.p181900_181999;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Problem181902Test {

  @Test
  void solution01() {

    // Given
    String my_string = "Programmers";
    int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0};

    // When
    int[] result = new Problem181902().solution(my_string);

    // Then
    assertArrayEquals(expected, result);
  }
}
