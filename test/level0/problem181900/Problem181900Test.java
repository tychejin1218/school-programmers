package level0.problem181900;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem181900Test {

  @Test
  void solution01() {

    // Given
    String my_string = "apporoograpemmemprs";
    int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
    String expected = "programmers";

    // When
    String result = new Problem181900().solution(my_string, indices);

    // Then
    assertEquals(expected, result);
  }
}
